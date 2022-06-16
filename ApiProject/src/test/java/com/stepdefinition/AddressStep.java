package com.stepdefinition;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import com.base.Baseclass;
import com.endpoints.Endpoints;
import com.omrbranch.pojo.AddAddress_Input_pojo;
import com.omrbranch.pojo.Login_output_pojo;
import com.payload.Payloads;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class AddressStep extends Baseclass{
	Response response;
	String logToken;

	@Given("User add header")
	public void userAddHeader() {
		addHeader("Content-Type", "application/json");
		//addHeader("accept", "application/json");

	}
	@And("User add basic authentication for login")
	public void userAddBasicAuthenticationForLogin() throws IOException {
		basicAuth(getPropertyValue("userName"), getPropertyValue("password"));

	}
	@And("User send {string} request for login endpoint")
	public void userSendRequestForLoginEndpoint(String post) {
		post="POST";
		response = requestType(post, Endpoints.LOGIN); 


	}
	@And("User verify the status code is {int}")
	public void userVerifyTheStatusCodeIs(Integer statuscode) {

		statuscode = getStatusCode(response);
		System.out.println(statuscode);
	}
		
		

		@Given("User add headers")
		public void userAddHeaders() {
	
			
			List<Header> header=new ArrayList<>();
			Header header1 = new Header("Content-Type","application/json");
			Header header2 = new Header("Authorization","Bearer "+logToken);
			Header header3 = new Header("accept","application/json");
			header.add(header1);
			header.add(header2);
			header.add(header3);
			Headers headers=new Headers(header);
			addHeaders(headers);
		}
		@And("User add request body {string},{string},{string},{string},{string},{string},{string},{string},{string} and {string}")
		public void userAddRequestBody(String first_name, String last_name, String mobile, String apartment, String state,
				String city, String country, String zipcode, String address, String address_type) {
		   		Payloads payload=new Payloads();
payload.createAddress(first_name, last_name, mobile, apartment, state, city, country, zipcode, address, address_type);
}
		
		@And("User send {string} request for AddAddress endpoint")
		public void userSendRequestForAddAddressEndpoint(String post) {
		   post="POST";
			
			 response = requestType(post, Endpoints.ADDADDRESS);
		}
		@Then("User Should verify the status code is {int}")
		public void userShouldVerifyTheStatusCodeIs(Integer statusCode) {
		     
		    System.out.println(getStatusCode(response));
		}
		@Then("User Should verify the message as {string}")
		public void userShouldVerifyTheMessageAs(String string ) {
			 com.omrbranch.pojo.AddAddress_Output_pojo addAddress_Output_pojo = response.as(com.omrbranch.pojo.AddAddress_Output_pojo.class);
			int address_id = addAddress_Output_pojo.getAddress_id();
			System.out.println(address_id);
			String message = addAddress_Output_pojo.getMessage();
			System.out.println(message);
			Assert.assertEquals(message, "Address added successfully" ,"verify Address added");
		}
		

		
		
		
	}




