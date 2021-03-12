package testCases;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GET_Or_Read_A_Product {
	
	
  SoftAssert softAssert	 = new SoftAssert();
	
	
	
		@Test
		public void read_A_Products() {
		 
			Response response=
		given()
		   // .log().all()
			.baseUri("https://techfios.com/api-prod/api/product")
			.header("Content-Type","application/json; charset=UTF-8")
			.queryParam("id", "1209")
		.when()
		 //   .log().all()
			.get("/read_one.php")
		.then()
		   // .log().status()
//			.statusCode(200)
//			.header("Content-Type","application/json; charset=UTF-8")
//			.header("Server","Apache")
			.extract().response();
			System.out.println(response);
			
			String responseBody = response.getBody().asString();
		//	System.out.println(responseBody);	
	
			String responseHeader = response.getHeader("Content-Type");
			System.out.println(responseHeader);
		//	softAssert.assertEquals(responseHeader, "application/json");
			softAssert.assertEquals(responseHeader, "application/json", "Header mismatch");
			
		//   Parsing ResponseBody to Jason
			JsonPath js = new JsonPath(responseBody);
		  
		    String productId = js.getString("id");
			String productname = js.getString("name");
			String productDescription = js.getString("description");
		
//			Assert.assertEquals(productId ,"1209");
//			Assert.assertEquals(productname, "HP Laptop Elite Pro");
//			Assert.assertEquals(productDescription,"Super fast laptop");
//			
			softAssert.assertEquals(productId ,"1209");
			softAssert.assertEquals(productname, "HP Laptop Elite Pro", "ProductName Mismatch!!!");
			softAssert.assertEquals(productDescription,"Super fast laptop");
			
			softAssert.assertAll();
			
			
			//System.out.println(productId);
			
			
			
		//	js.prettyPrint();
		//	System.out.println(js);
			
			
			
			
//			int statusCode = response.getStatusCode();
//			System.out.println("StatusCode: " + statusCode);
//			Assert.assertEquals(statusCode, 200);
//		   //softAssert.assertEquals(statusCode,201,statusCode + "statusCode doesn't match" + "201");
//			//softAssert.assertEquals(statusCode, 201, "Not Matching");
//		
//			//String responseBody = response.getBody().prittyPrint();
//			String responseBody = response.getBody().asString();
//				System.out.println(responseBody);	
//				
//			long responseTime = response.getTimeIn(TimeUnit.MILLISECONDS);
//				System.out.println("Response Time:"  + responseTime);
//			if(responseTime<=1000) {
//				System.out.println("Response time is within the range");
//				
//			}	else{
//				System.out.println("Not Acceptable!!");
//			}
//				
//				
				
		}		
					
					
	}
	
	
