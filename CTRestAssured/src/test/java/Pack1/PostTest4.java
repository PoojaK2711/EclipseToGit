package Pack1;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostTest4 {
	
	@Test
	
	public void test_1_post() {
		
		
//		HashMap<String,Object> map = new HashMap<String,Object>();
//		
//		map.put("name","Raghav");
//		map.put("job","Teacher");
//		
//		System.out.println(map);
//		
//		JSONObject obj = new JSONObject(map);
//		System.out.println(obj);//but sometimes it will not work
//		System.out.println(obj.toJSONString());
		
		
		//diffreent way to same 
		
		JSONObject obj = new JSONObject();
		obj.put("name","Raghav");
		obj.put("job","Teacher");
		System.out.println(obj);
		
		given().
		body(obj.toJSONString()).
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		when().
		post("https://reqres.in/api/users?page=2").
		then().
		statusCode(201);//if we put 200 we get error
		
		
		
	}

}
