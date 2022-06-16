package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Baseclass {
	RequestSpecification reqSpec;
	Response response;
	public void addHeader(String key, String value) {
		reqSpec = RestAssured.given().header(key,value);
		}
	
	public void queryParam(String key, String value) {
		reqSpec= reqSpec.queryParam(key, value);
		}
	public void addBody(Object body) {
		reqSpec=reqSpec.body(body);
}
	public void addHeaders(Headers headers) {
		reqSpec=RestAssured.given().headers(headers);
	}
	
	public void addBody(String body) {
		reqSpec=reqSpec.body(body);
		}
	
	public void formData() {

	reqSpec.multiPart("profile_picture", new File("C:\\Users\\orton\\Downloads\\pexels-spencer-selover-428388.jpg"));
	}
	
	
	public Response requestType(String reqType, String endPoint) {
		switch (reqType) {
		case "GET":
			response = reqSpec.log().all().get(endPoint);
			break;
		case "POST":
			response = reqSpec.log().all().post(endPoint);
			break;
		case "PUT":
			response = reqSpec.log().all().put(endPoint);
			break;
		case "DELETE":
			response = reqSpec.log().all().delete(endPoint);
			break;

		default:
			break;
		}
		return response;
	}
public int getStatusCode(Response response) {
int statusCode = response.getStatusCode();
return statusCode;
}

public ResponseBody getBody(Response response) {
	ResponseBody body = response.getBody();
	return body;
	}
public String getBodyAsString(Response response) {
	String asString=getBody(response).asString();
	return asString;
	}
public String getBodyAsPrettyString(Response response) {
	String asPrettyString=getBody(response).asPrettyString();
	return asPrettyString;
	}
public void basicAuth(String userName, String password) {
	reqSpec.auth().preemptive().basic(userName, password);
 	
}

public void bearerToken(String accessToken) {
	
		reqSpec.auth().preemptive().oauth2(accessToken);
	}

public static String getPropertyValue(String key) throws IOException {
	Properties properties=new Properties();
	FileInputStream stream= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
	properties.load(stream);
	Object obj = properties.get(key);
String value=(String)obj;
return value;
}
	

}
