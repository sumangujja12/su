package starter.Stepdefinitions;

import java.io.FileNotFoundException;
import org.junit.Assert;

import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Favorites_user_GET {
	@When("Favourite for Trend GET Rerquest")
	public void vessel() throws FileNotFoundException{
		
		AuthTest st=new AuthTest();
		st.token_generation();
		java.lang.String accesstoken=st.token;
		System.out.println(accesstoken);
		
		
		//File f= new File("../WIDEAPI/Favorite_Trend_Delete.json");
		//FileReader fr=new FileReader(f);
		//JSONTokener js=new JSONTokener(fr);
		//JSONObject ob=new JSONObject(js);
		
		RequestSpecification request=RestAssured.given().relaxedHTTPSValidation();
		
		
		
		Response response=request.header("Content-Type","application/json").header("user_id","12345").header("type","trend").header("Authorization",accesstoken).get("/api/v2.1/favourite");
		response.prettyPrint();
		
		System.out.println("status code is " + response.statusCode());
		System.out.println("API response body = " + response.asString());
		
		Assert.assertEquals(response.statusCode(), 200);
		//Assert.assertEquals(response.body().jsonPath().getString("message"), "Favorite deleted successfully");
	 
	 
}
}
