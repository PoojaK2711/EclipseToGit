package Pack1;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class GetTest3 {
	
	@Test
	public void test_1() {
		given().get("https://reqres.in/api/users?page=2").
		then().statusCode(200).body("data.id[1]",equalTo(8)).log().all().
		body("data.first_name",hasItems("Michael","Lindsay"));
	}

}
