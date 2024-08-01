package starter.Stepdefinitions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.Assert;

import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Enginetuningdata {
	@When("Enginetuningdata API Post Rerquest")
	public void vessel() throws IOException{
		
		
		AuthTest st=new AuthTest();
		st.token_generation();
		String accesstoken=st.token;
		System.out.println(accesstoken);
		
		File f= new File("enginetuningdata.json");
		FileReader fr=new FileReader(f);
		JSONTokener js=new JSONTokener(fr);
		JSONObject ob=new JSONObject(js);
		
		
		RequestSpecification request1=RestAssured.given().relaxedHTTPSValidation();
		
		
		
		Response response=request1.body(ob.toString()).header("Content-Type","application/json").header("Authorization",accesstoken).post("/api/v2.1/enginetuningdata");
		response.prettyPrint();
		
		System.out.println("status code is " + response.statusCode());
		System.out.println("API response body = " + response.asString());
		Assert.assertEquals(response.statusCode(), 200);
		 
		//Assert.assertEquals(response.body().jsonPath().getString("message"), "Data retrieved successfully");
}
}
