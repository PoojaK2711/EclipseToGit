package Pack1;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeleteTest7 {
	
	@Test
	public void test_1() {
		
//		JSONObject obj = new JSONObject();
//		obj.put("name","Rama");
//		obj.put("job","Teacher");
//		System.out.println(obj);
		
		given().
		//body(obj.toJSONString()).
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		when().
		delete("https://reqres.in/api/users/2").
		then().
		statusCode(204
				).log().all();//if we put 200 we get error
		
	}

}
