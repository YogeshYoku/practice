package org.sample;

import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import com.base.Baseclass;
import com.base.Endpoints;
import com.pojo.Login_output_pojo;

import io.restassured.response.Response;

public class Sample5 extends Baseclass{
	@Test
	public void getUsers() throws IOException, ParseException {
		addHeader("Content-Type", "application/json");
        basicAuth(getPropertyValue("userName"),getPropertyValue("password"));
		Response response = requestType("POST", Endpoints.LOGIN);
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		String bodyAsPrettyString = getBodyAsPrettyString(response);
		JSONParser jsonparser=new JSONParser();	
		Object parse = jsonparser.parse(bodyAsPrettyString);
		Login_output_pojo login = response.as(Login_output_pojo.class);
	String firstName = login.getData().getFirst_name();
	System.out.println(firstName);
		
		
	
	
}
}