package org.stepdefinition;

import java.io.IOException;

import org.testng.Assert;

import com.base.Baseclass;
import com.base.Endpoints;
import com.pojo.Login_output_pojo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

public class AddressStep extends Baseclass {

	String logToken;
	Response response;
	@Given("User add header")
	public void user_AddHeader() {
		addHeader("Content-Type", "application/json");
		

	
	}
    @And("User add basic authentication for login")
    public void user_Add_BasicAuthentication_for_Login() throws IOException {
    	basicAuth(getPropertyValue("userName"), getPropertyValue("password"));
			

    
    }
    
    @And("User send {POST} request for login endpoint")
    public void user_Send_Postrequest_for_Login_Endpoint(String String) {
     response = requestType("POST", Endpoints.LOGIN);
		
    	
	}
   @Then("User verify the status code is {int}")
   public void user_Verify_the_StatusCode(int a) {
	   int statusCode = getStatusCode(response);
		System.out.println(statusCode);

		String bodyAsPrettyString = getBodyAsPrettyString(response);


   
   }
    
    
    @And("User should get the logtoken saved and verify the response body message as {String}")
    public void user_Should_Get_The_LogToken_Saved_and_verify_the_response_body_message_as(String message){
    	Login_output_pojo login_output_pojo = response.as(Login_output_pojo.class);


   	 logToken = login_output_pojo.getData().getLogtoken();
   	System.out.println(logToken);
   	String message1 = login_output_pojo.getMessage();
   	System.out.println(message1);

   	Assert.assertEquals(message1, "Login successfully" ,"verify Address added");	
    
    }

	

}
