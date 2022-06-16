package org.sample;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.Baseclass;
import com.base.Endpoints;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Sample4 extends Baseclass {
	@Test
	public void getUsers() throws IOException, ParseException {
		addHeader("Content-Type", "application/json");
        basicAuth(getPropertyValue("userName"),getPropertyValue("password"));
		Response response = requestType("POST", Endpoints.LOGIN);
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		String bodyAsPrettyString = getBodyAsPrettyString(response);
		//System.out.println(bodyAsPrettyString);
		JSONParser jsonparser=new JSONParser();	
		Object parse = jsonparser.parse(bodyAsPrettyString);
		/*
		 * JSONObject j=(JSONObject)parse; Object objData = j.get("data"); JSONObject
		 * jName=(JSONObject)objData; Object lstName = jName.get("last_name"); String
		 * lastName=(String)lstName; System.out.println(lastName);
		 */
		//Instead of Using Json path and json Array We are using json path
		
		ResponseBody body = getBody(response);
		JsonPath jsonPath = body.jsonPath();
		Object o = jsonPath.get("data.first_name");
		String firstName=(String)o;
		System.out.println(firstName);
		
		Assert.assertEquals(firstName, "YOGESHKUMAR","verify lastname");

	}

}
