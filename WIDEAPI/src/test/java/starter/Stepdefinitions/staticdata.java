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

public class staticdata {
	
	@When("staticdata Post Rerquest")
	public void vessel1() throws FileNotFoundException{
		
		AuthTest st=new AuthTest();
		st.token_generation();
		java.lang.String accesstoken=st.token;
		System.out.println(accesstoken);
		
		File f= new File("payload_staticdata.json");
		FileReader fr=new FileReader(f);
		JSONTokener js=new JSONTokener(fr);
		JSONObject ob=new JSONObject(js);
		
		
		RequestSpecification request=RestAssured.given().relaxedHTTPSValidation();
		
		
		
		Response response=request.body(ob.toString()).header("Content-Type","application/json").header("Authorization",accesstoken).post("/api/v2.1/staticdata");
		response.prettyPrint();
		
		System.out.println("status code is " + response.statusCode());
		System.out.println("API response body = " + response.asString());
		
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.body().jsonPath().getString("enginenumber"), "[19926]");
	 
}
}
