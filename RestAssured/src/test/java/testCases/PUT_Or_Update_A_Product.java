package testCases;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PUT_Or_Update_A_Product {
	
	
  SoftAssert softAssert	 = new SoftAssert();
	
	
	
		@Test
		public void update_A_Products() {
		 
			HashMap payload =new HashMap();
			payload.put("id", "1203");
			payload.put("name", "Samsung");
			payload.put("description", "Pretty good phone");
			payload.put("price", "1199");
			payload.put("category_name", "Electronics");
			payload.put("category_id", "2");
		
			
			
			Response response=
		given()
		   // .log().all()
			.baseUri("https://techfios.com/api-prod/api/product")
			.header("Content-Type","application/json; charset=UTF-8")
			.body(payload)
			//.queryParam("id", "1209")
		.when()
		 //   .log().all()
			.put("/update.php")
		.then()
		   // .log().status()
//			.statusCode(200)
//			.header("Content-Type","application/json; charset=UTF-8")
//			.header("Server","Apache")
			.extract().response();
			System.out.println(response);
			
			String responseBody = response.getBody().asString();
			System.out.println(responseBody);	
	
		//   Parsing ResponseBody to Jason
  		     JsonPath js = new JsonPath(responseBody);
  		     
  		 //softAssert.assertEquals(statusCode, 201, "Not Matching");
  		     
  		     
  		     
//		  
//			String productId = js.getString("id");
//			String productname = js.getString("name");
//			String productDescription = js.getString("description");
//			Assert.assertEquals(productId ,"1209");
//			Assert.assertEquals(productname, "Hp Laptop Elite Pro");
//			Assert.assertEquals(productDescription,"Super fast laptop");
//			
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
	
	
