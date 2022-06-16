package org.sample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.parser.JSONParser;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.Baseclass;
import com.base.Endpoints;
import com.pojo.AddAddress_Input_pojo;
import com.pojo.AddAddress_Output_pojo;
import com.pojo.DeleteAddress_Input_pojo;
import com.pojo.DeleteAddress_Output_pojo;
import com.pojo.GetAddress_Output_pojo;

import com.pojo.Login_output_pojo;
import com.pojo.UpdateAddress_Input_pojo;
import com.pojo.UpdateAddress_Output_pojo;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class OmrBranchClass extends Baseclass{
String logToken;
int address_id;
@Test(priority = 0)
public void login() throws IOException {
	addHeader("Content-Type", "application/json");
	basicAuth(getPropertyValue("userName"), getPropertyValue("password"));
	Response response = requestType("POST", Endpoints.LOGIN);
	int statusCode = getStatusCode(response);
	System.out.println(statusCode);
	String bodyAsPrettyString = getBodyAsPrettyString(response);

Login_output_pojo login_output_pojo = response.as(Login_output_pojo.class);


 logToken = login_output_pojo.getData().getLogtoken();
System.out.println(logToken);
String last_name = login_output_pojo.getData().getLast_name();
System.out.println(last_name);
}
@Test(priority = 2)
public void createAddress() {
	List<Header> header=new ArrayList<>();
	Header header1 = new Header("Content-Type","application/json");
	Header header2 = new Header("Authorization","Bearer "+logToken);
	Header header3 = new Header("accept","application/json");
	header.add(header1);
	header.add(header2);
	header.add(header3);
	Headers headers=new Headers(header);
	addHeaders(headers);
	AddAddress_Input_pojo addAddress_Input_pojo=new AddAddress_Input_pojo("Yogesh","kumar","8939691801","Akshaya",23,1000,101,"600001","sowcarpet","Home");
	addBody(addAddress_Input_pojo);
	Response response = requestType("POST", Endpoints.ADDADDRESS);
	System.out.println(getStatusCode(response));
	AddAddress_Output_pojo addAddress_Output_pojo = response.as(AddAddress_Output_pojo.class);
	 address_id = addAddress_Output_pojo.getAddress_id();
	System.out.println(address_id);
	String message = addAddress_Output_pojo.getMessage();
	System.out.println(message);
	Assert.assertEquals(message, "Address added successfully" ,"verify Address added");
	}
@Test(priority = 3)
private void updateAddress() {
	List<Header> header=new ArrayList<>();
	Header header1 = new Header("Content-Type","application/json");
	Header header2 = new Header("Authorization","Bearer "+logToken);
	header.add(header1);
	header.add(header2);
	Headers headers=new Headers(header);
	addHeaders(headers);
UpdateAddress_Input_pojo updateAddress_Input_pojo=new UpdateAddress_Input_pojo(String.valueOf(address_id),"YogeshYoku","kumar","8939691801","Akshaya",23,1000,101,"600001","SOWCARPET","Home");
addBody(updateAddress_Input_pojo);
Response response = requestType("PUT", Endpoints.UPDATEADDRESS);
System.out.println(getStatusCode(response));
UpdateAddress_Output_pojo updateAddress_Output_pojo = response.as(UpdateAddress_Output_pojo.class);
int status = updateAddress_Output_pojo.getStatus();
System.out.println(status);
String message1= updateAddress_Output_pojo.getMessage();
System.out.println(message1);
Assert.assertEquals(message1, "Address updated successfully" ,"verify Address Updated");

}
@Test(priority=4)
public void getAddress() {
	List<Header> header=new ArrayList<>();
	Header header1 = new Header("Content-Type","application/json");
	Header header2 = new Header("Authorization","Bearer "+logToken);
	header.add(header1);
	header.add(header2);
	Headers headers=new Headers(header);
	addHeaders(headers);
	Response response = requestType("GET", Endpoints.GETADDRESS);
	System.out.println(getStatusCode(response));
	GetAddress_Output_pojo getAddress_Output_pojo = response.as(GetAddress_Output_pojo.class);
	String message = getAddress_Output_pojo.getMessage();
	System.out.println(message);
	Assert.assertEquals(message, "OK","verify getAddress message field contains ok");
int status = getAddress_Output_pojo.getStatus();
System.out.println(status);
}
@Test(priority = 5)
public void deleteAddress() {
	List<Header> header=new ArrayList<>();
	Header header1 = new Header("Content-Type","application/json");
	Header header2 = new Header("Authorization","Bearer "+logToken);
	header.add(header1);
	header.add(header2);
	Headers headers=new Headers(header);
	addHeaders(headers);
	DeleteAddress_Input_pojo deleteAddress_Input_pojo=new DeleteAddress_Input_pojo(String.valueOf(address_id));
	
addBody(deleteAddress_Input_pojo);
Response response = requestType("DELETE", Endpoints.DELETEADDRESS);
System.out.println(getStatusCode(response));
DeleteAddress_Output_pojo deleteAddress_Output_pojo = response.as(DeleteAddress_Output_pojo.class);
String message = deleteAddress_Output_pojo.getMessage();
System.out.println(message);
Assert.assertEquals(message, "Address deleted successfully","verify Address Deleted Successfully");
}
@Test(priority = 0)

public void changeProfilePic() {
	List<Header> header=new ArrayList<>();
	Header header1 = new Header("accept","application/json");
	Header header2 = new Header("Authorization","Bearer "+logToken);
	Header header3 = new Header("Content-Type","multipart/form-data");
	
	header.add(header1);
	header.add(header2);
	header.add(header3);
	Headers headers=new Headers(header);
	addHeaders(headers);

	formData();
	 Response response = requestType("POST", Endpoints.CHANGEPROFILEPIC);
	System.out.println(getStatusCode(response));
	System.out.println(response);
	
	
	
	
}
}
