package org.restassured;

import com.fasterxml.jackson.core.util.RequestPayload;

import io.restassured.RestAssured;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Reqres {
	 static RequestSpecification reqSpec;
	 static Response reponse;
	 
		
		/*
		 * public static void get(String endPoint) { reqSpec=RestAssured.given();
		 * reqSpec= reqSpec.header("Context-type", "application/json");
		 * reqSpec=reqSpec.queryParam("page", "2"); Response response =
		 * reqSpec.get(endPoint); int statusCode = response.getStatusCode();
		 * //System.out.println(statusCode); ResponseBody body = response.getBody();
		 * String asString = body.asString(); //System.out.println(asString); String
		 * asPrettyString = body.asPrettyString(); System.out.println(asPrettyString);
		 * 
		 * 
		 * 
		 * }
		 */
	 public static void post(String endPoint, String payLoad) {
		 reqSpec=RestAssured.given();
		 reqSpec= reqSpec.header("Context-type", "application/json");
		 reqSpec.body(payLoad);
		 
		 Response response = reqSpec.post(endPoint);
		 int statusCode = response.getStatusCode();
		 //System.out.println(statusCode);
		 ResponseBody body1 = response.getBody();
		 String asString = body1.asString();
		 //System.out.println(asString);
		 String asPrettyString = body1.asPrettyString();
		 System.out.println(asPrettyString);


	}
	 public static void put(String endPoint, String payLoad) {
		 reqSpec=RestAssured.given();
		 reqSpec= reqSpec.header("Context-type", "application/json");
		 reqSpec.body(payLoad);
		 
		 Response response = reqSpec.put(endPoint);
		 int statusCode = response.getStatusCode();
		 //System.out.println(statusCode);
		 ResponseBody body1 = response.getBody();
		 String asString = body1.asString();
		 //System.out.println(asString);
		 String asPrettyString = body1.asPrettyString();
		 System.out.println(asPrettyString);
		 
		 
	 }
	 public static void main(String[] args) {
		 //System.out.println("ListUsers=============================================");
	//get("https://reqres.in/api/users?page=2");
	//System.out.println("SingleUser=============================================");
	//get("https://reqres.in/api/users/2");
	//System.out.println("SingleUser not Found=============================================");
	//get("https://reqres.in/api/users/23");
	//System.out.println("List<Resource>=============================================");
	//get("https://reqres.in/api/unknown");
	//System.out.println("Single<Resource>=====================================");
	//get("https://reqres.in/api/unknown/2");
	//System.out.println("Single<Resource>not Found");
	//get("https://reqres.in/api/unknown/23");
		 System.out.println("CREATE");
		 
	post("https://reqres.in/api/users","{\r\n"
	 		+ "    \"name\": \"morpheus\",\r\n"
	 		+ "    \"job\": \"leader\"\r\n"
	 		+ "}");
	
	System.out.println("update");
	put("https://reqres.in/api/users/2", "{\r\n"
			+ "    \"name\": \"morpheus\",\r\n"
			+ "    \"job\": \"zion resident\"\r\n"
			+ "}");
	
	}
	}



