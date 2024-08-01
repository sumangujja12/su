package starter.postcodes;

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

public class notes {
	
	@When("Notes Post Rerquest")
	public void vessel() throws FileNotFoundException{
		
		AuthTest st=new AuthTest();
		st.token_generation();
		java.lang.String accesstoken=st.token;
		System.out.println(accesstoken);
		
		File f= new File("payload_Notes.json");
		FileReader fr=new FileReader(f);
		JSONTokener js=new JSONTokener(fr);
		JSONObject ob=new JSONObject(js);
		
		
		RequestSpecification request=RestAssured.given().relaxedHTTPSValidation();
		
		
		
		Response response=request.header("Content-Type","application/json").body(ob.toString()).header("Authorization",accesstoken).post("/api/v2.1/notes");
		response.prettyPrint();
		
		System.out.println("status code is " + response.statusCode());
		System.out.println("API response body = " + response.asString());
		
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.body().jsonPath().getString("message"), "Notes added successfully !");
		
		Response response1=request.header("Content-Type","application/json").body(ob.toString()).header("Authorization",accesstoken).put("/api/v2.1/notes/97");
		response1.prettyPrint();
	 
}
}
