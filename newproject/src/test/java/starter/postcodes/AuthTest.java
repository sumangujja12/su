package starter.postcodes;






import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AuthTest {
	
public String token;
public static void beforeAll() {
}
	public void token_generation(){
		
		RestAssured.baseURI="https://wideui-backend.dev2.wingd.digital/";
		//RequestSpecification request=RestAssured.given().relaxedHTTPSValidation().auth().preemptive().basic("suman", "Suman#1234");
		
		RequestSpecification request=RestAssured.given().relaxedHTTPSValidation();
		request.header("Content-Type","application/json");
		request.header("authorization","mSBKmW+YivmI9HE3ndhEXo4+IMITEvAl5J/cDhl2eUU=");
		request.header("User-Agent", "PostmanRuntime/7.29.2");
		
		
		Response response=request.post("api/v2.1/login");
		response.prettyPrint();
		String  token = response.body().jsonPath().getString("tokens.IdToken");
		System.out.println(token);
		this.token=token;
	 
}
}
