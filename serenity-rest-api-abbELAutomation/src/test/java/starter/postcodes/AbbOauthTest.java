package starter.postcodes;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

import io.restassured.response.Response;

public class AbbOauthTest {
	static String accessToken;
	static String Username="admin";
	static String Password="Admin@1234";

	@Test
	public void getAccessToken(){
	 Response response=given()
	 .auth().preemptive()
	.basic(Username,Password)
	.param("grant_type","client_credentials")
	.log().all()
	.post("https://wideui-backend.dev2.wingd.digital/api/v2.1/login");
	 response.prettyPrint();
	 System.out.println("Status Code is "+response.statusCode());
	 accessToken=response.getBody().path("access_token");
	 System.out.println(accessToken);
	 System.out.println(accessToken.length());
}
}