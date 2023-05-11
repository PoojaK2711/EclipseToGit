package Pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetTest2 {
	
	@Test
	void testMethod1() {
		
		Response response = get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getBody());
		System.out.println(response.getTime());
		
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(statusCode,200);
		

	}
	
	@Test
	void test2() {
		
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
	}
	
	@Test
	void test3() {
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[0]",equalTo(7));
	// arguments of body is (arguments,response aware matcher) so we have to import static
	
	}

}


