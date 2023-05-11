package Pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetTest1 {
	
	@Test
	void testMethod1() {
		
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getBody());
		System.out.println(response.getTime());
		
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(statusCode,200);
		

	}

}
