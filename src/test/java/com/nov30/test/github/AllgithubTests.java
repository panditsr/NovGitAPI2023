package com.nov30.test.github;

import java.util.List;
import java.util.Arrays;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



//import com.nov.test.simpletests.JSONObject;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

public class AllgithubTests {
   
	
		@Test
		public void getAllRecords	() {
			RestAssured.baseURI="https://api.github.com/";
			
			String token = "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";
			//List<GetAlluserPOJO> listofuser =RestAssured
			Response res =RestAssured		
			.given()
			
			.header("Authorization", "Bearer " + token)
			.when()
			.get("/user/repos");
			//.get("/user/repos").as(new TypeRef<List<GetAlluserPOJO>>() {});
			//System.out.println("total number of records="+ listofuser.size())
			//res.then().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("getallreporesponseSchema.json"));
			res.then()
			.statusCode(200)
			.contentType(ContentType.JSON)
			.time(lessThan(4000L));
			res.prettyPrint();
			
	}
		@Test
	public void getSingleRepo() {
			
			RestAssured.baseURI="https://api.github.com/";
			
			String token = "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";
			
			Response res =RestAssured		
			.given()
			.header("Authorization", "Bearer " + token)
			.when()
			.get("/repos/panditsr/Hello-world");
			
			res.then()
			.assertThat()
		    .statusCode(200)
		    .header("Content-Type", "application/json; charset=utf-8")
		    .body("full_name", equalTo("panditsr/Hello-World"))
		    .body("default_branch", equalTo("main"));
			res.prettyPrint();
	}	
	  @Test	
	public void getSingleRepoWithNonExistingRepoName() {		  
			
			
			RestAssured.baseURI="https://api.github.com/";
			
			String token = "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";
			
			Response res =RestAssured		
			.given()
			.header("Authorization", "Bearer " + token)
			.when()
			.get("/repos/NonExistentuser/NonExistantRepo");
			
			res.then()
			.assertThat()
	        .statusCode(404)
	        .body("message", equalTo("Not Found"));
			res.prettyPrint();
	}	
	@Test
	  public void createTheRepo() {
		  
		  RestAssured.baseURI="https://api.github.com/";
			
			String token = "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";
			 String requestBody = "{\n" +
		                "    \"name\": \"Hello-World2\",\n" +
		                "    \"description\": \"This is your first repo!\",\n" +
		                "    \"homepage\": \"https://github.com\",\n" +
		                "    \"private\": false\n" +
		                "}";
			Response res =RestAssured		
			.given()
			.contentType(ContentType.JSON)
			.header("Authorization", "Bearer " + token)
			.body(requestBody)
			.when()
			.post("/user/repos");
			
			res.then()
	           .statusCode(201)
	           .body("name", equalTo("Hello-World2"))
	           .body("owner.login", equalTo("panditsr"))
	           .body("owner.type", equalTo("User"));
			   
			
			res.prettyPrint();
	  }
	@Test
	public void createTheRepoWithExistingName() {
		  
		RestAssured.baseURI="https://api.github.com/";
		
		String token = "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";
		 String requestBody = "{\n" +
	                "    \"name\": \"Hello-World2\",\n" +
	                "    \"description\": \"This is your first repo!\",\n" +
	                "    \"homepage\": \"https://github.com\",\n" +
	                "    \"private\": false\n" +
	                "}";
		Response res =RestAssured		
		.given()
		.contentType(ContentType.JSON)
		.header("Authorization", "Bearer " + token)
		.body(requestBody)
		.when()
		.post("/user/repos");
			
		 res.then()
	    .statusCode(422) 
	    //.body("errors.message", equalTo("<[name already exists on this account]>"));
		 .body("errors", equalTo("name already exists on this account"));
	     //res.prettyPrint();
	}
	
	@Test
			
	public void UpdateTheRepositoryName() {
		  
		  RestAssured.baseURI="https://api.github.com/";
			
			String token = "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";
			String requestBody="{\"name\": \"HELLO-API1\",\r\n"
					+ "\"description\": \"my repository created using apis after update\",\r\n"
					+ "\"private\": \"False\"}";
			
			
			Response res =RestAssured
			
			.given()
			.contentType(ContentType.JSON)
			.header("Authorization", "Bearer " + token)
			.body(requestBody)
			.when()
			.patch("/repos/panditsr/Hello-world2");
			
			res.then()
	         .statusCode(200)
	         .body("name", equalTo("HELLO-API1"));
	         
			   
			
			res.prettyPrint();
	}
		@Test
	public void deleteTheRepo() {
			  
			
			
			RestAssured.baseURI="https://api.github.com/";
			
			String token = "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";
			
			Response res =RestAssured
			
			.given()
			.header("Authorization", "Bearer " + token)
			.when()
			.delete("/repos/panditsr/HELLO-API1");
			
			 res.then()
			
	        .statusCode(204)
	        .extract()
	        .response();
	       
			res.prettyPrint();
	}
		@Test
	public void deleteTheRepoWithNonExistingName() {
			  
			
			
			RestAssured.baseURI="https://api.github.com/";
			
			String token = "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";
			
			Response res =RestAssured
			
			.given()
			.header("Authorization", "Bearer " + token)
			.when()
			.delete("/repos/panditsr/sr1");
			
			 res.then()
			
	        .statusCode(404)
	        .body("message", equalTo("Not Found"));
	        
	       
			res.prettyPrint();
	}
	}


	