package starter.Stepdefinitions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.Assert;

import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

public class Signals_genericname {
	@When("Verify the Signals with generic name API Post request")
	public void signal() throws FileNotFoundException, ParseException{
		AuthTest st=new AuthTest();
		st.token_generation();
		java.lang.String accesstoken=st.token;
		System.out.println(accesstoken);
		JSONObject jObj = new JSONObject(new FileReader("Signals_genericname.json"));
		
		RequestSpecification request=RestAssured.given().relaxedHTTPSValidation();
		
		
		
		Response response=request.body(jObj.toString()).header("Content-Type","application/json").header("Authorization",accesstoken).post("/api/v2.1/signals");
		response.prettyPrint();
		
		System.out.println("status code is " + response.statusCode());
		System.out.println("API response body = " + response.asString());
		
		//Assert.assertEquals(response.statusCode(), 200);
		//Assert.assertEquals(response.body().jsonPath().getString("Host"), "ECS1");
	 
}
}
