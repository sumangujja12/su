package starter.Stepdefinitions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.Assert;

import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.minidev.json.JSONValue;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;


public class lastupdated_timestamp {
	@When("Verify the Lastupdated with Timestamp API Post request")
	public void signal() throws IOException, ParseException{
		AuthTest st=new AuthTest();
		st.token_generation();
		java.lang.String accesstoken=st.token;
		System.out.println(accesstoken);
		
		//File f= new File("../WIDEAPI/Lastupdated_timestamp.json");
		JSONObject jObj = new JSONObject(new FileReader("Lastupdated_timestamp.json"));	
	//FileReader fr=new FileReader(f);
		//JSONTokener js=new JSONTokener(fr);
		//JSONObject ob=new JSONObject(js);
		
		//FileReader fr = new FileReader("../WIDEAPI/Lastupdated_timestamp.json");
        //JSONParser parser = new JSONParser();
       // JSONArray jObj = (JSONArray) parser.parse(fr);
		
		
		
		RequestSpecification request=RestAssured.given().relaxedHTTPSValidation();
		
		
		
		Response response=request.body(jObj.toString()).header("Content-Type","application/json").header("Authorization",accesstoken).post("/api/v2.1/lastupdated");
		response.prettyPrint();
		
		System.out.println("status code is " + response.statusCode());
		System.out.println("API response body = " + response.asString());
		
		//Assert.assertEquals(response.statusCode(), 200);
		//Assert.assertEquals(response.body().jsonPath().getString("Host"), "ECS1");
	 
}
}
