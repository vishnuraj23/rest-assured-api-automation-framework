package com.api.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class PostObjectsTest {

	@Test(priority = 1)
	public static void PostRequest() {
		String requestBody = """
						        {
				  "name": "Vishnu MacBook Pro 16",
				  "data": {
				    "year": 2019,
				    "price": 1849.99,
				    "CPU model": "Intel Core i9",
				    "Hard disk size": "1 TB"
				  }
				}
						        """;

		    given()
		        .baseUri("https://api.restful-api.dev")
		        .contentType("application/json")
		        .body(requestBody)

		    .when()
		        .post("/objects")

		    .then()
		        .statusCode(200);
		
		
	}
	

}
