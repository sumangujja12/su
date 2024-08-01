package starter.Stepdefinitions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.Assert;

import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Datadownloader {
	@When("Verify the Datadownloader API Post request")
	public void signal() throws FileNotFoundException{
		AuthTest st=new AuthTest();
		st.token_generation();
		java.lang.String accesstoken=st.token;
		System.out.println(accesstoken);
		
		File f= new File("datadownloader.json");
		FileReader fr=new FileReader(f);
		JSONTokener js=new JSONTokener(fr);
		JSONObject ob=new JSONObject(js);
		
		RequestSpecification request=RestAssured.given().relaxedHTTPSValidation();
		
		
		
		Response response=request.body(ob.toString()).header("Content-Type","application/json").header("Authorization",accesstoken).post("/api/v2.1/datadownloader");
		response.prettyPrint();
		
		System.out.println("status code is " + response.statusCode());
		System.out.println("API response body = " + response.asString());
		
		Assert.assertEquals(response.statusCode(), 201);
		//Assert.assertEquals(response.body().jsonPath().getString("message"), "Your RequestId bd2dd8f4-2ad9-46ad-92c8-5d22c893df25 accepted. Please check your registered email to receive zipped data");
	 
}
}
