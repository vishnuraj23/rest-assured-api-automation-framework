package com.api.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class GetObjectsTest {

	    @Test(priority = 0)
	    public void getAllObjectsTest() {
	    	given().baseUri("https://api.restful-api.dev")
	    	.when().get("/objects/7")
	    	.then().statusCode(200);
	    
	    }
	    
	    @Test (priority = 1)
	    public void getObjectsTest7() {
	    	given().baseUri("https://api.restful-api.dev")
	    	.when().get("/objects/7")
	    	.then().statusCode(200)
	    	.body("id", equalTo("7"))
	    	.body("name", equalTo("Apple MacBook Pro 16"));
	    
	    }
	    
	    @Test(priority = 2)
	    public static void nestedData(){
	    	given().baseUri("https://api.restful-api.dev")
	    	.when().get("/objects/7")
	    	.then().statusCode(200)
	    	.body("id", equalTo("7"))
	    	.body("name", equalTo("Apple MacBook Pro 16"))
	    	.body("data.year", equalTo(2019))
	    	.body("data.'CPU model'", equalTo("Intel Core i9"))
	    	.body("data.'Hard disk size'", equalTo("1 TB"));
	    }
	    
	    
	    @Test
	    public static void apiTest() {
	    	given().baseUri("https://automationexercise.com/api")
	    	.when().get("/productsList")
	    	.then().statusCode(200);
	    }

}
