package starter.postcodes;

import static io.restassured.RestAssured.given;
import org.junit.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Basicauth {
	static String accessToken;
	static String Username="admin";
	static String Password="Admin@1234";
	//public  X509Certificate[] getAcceptedIssuers() { return new X509Certificate[0];}
	//@Test
	 @Given ("I look up for token generation1")
	public void getAccessToken(){
		RestAssured.baseURI="https://wideui-backend.dev2.wingd.digital/";
		RequestSpecification request=RestAssured.given().relaxedHTTPSValidation().auth().preemptive().basic("admin", "Admin@1234");
		//String credentials="admin:Admin@1234";
		//byte[]encodedcredentials=Base64.encodeBase64(credentials.getBytes());
		//String encodedcredentailsAsString=new String(encodedcredentials);
		//request.header("Authorization","Basic"+encodedcredentailsAsString);
		
		request.header("Content-Type","application/json");
		request.header("User-Agent", "PostmanRuntime/7.29.2");
		//request.header("Authorization","eyJraWQiOiJvUGlrUWFjeSthVVwvbUR6SEp2NEhcL2VxcTBUSEJEVjdhNXBHa0hSQ3g2cG89IiwiYWxnIjoiUlMyNTYifQ.eyJzdWIiOiI3NDY4YjFmMS05YzNhLTRhNTQtYmIwMC01NDE3OTgyNWNmMTgiLCJjb2duaXRvOmdyb3VwcyI6WyJXaW5HRC1BZG1pbiJdLCJkYXRhIjoie1wib3duZXJzXCI6IFwiKlwiLCBcInVpX3NldHRpbmdzXCI6IFwiKlwiLCBcInNpZ25hbHNcIjogXCIqXCIsIFwiSHR0cF9WZXJic1wiOiBcIipcIiwgXCJpbW9cIjogXCIqXCIsIFwiR3JvdXBfbmFtZVwiOiBcIldpbkdELUFkbWluXCIsIFwiQXBpX0FjY2Vzc1wiOiBcIipcIiwgXCJmYXZvcml0ZVwiOiBcIipcIiwgXCJ3cml0ZV90b19teXNxbF90YWJsZXNcIjogXCIqXCJ9IiwiQXBpX0FjY2VzcyI6IlwiKlwiIiwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLmV1LXdlc3QtMS5hbWF6b25hd3MuY29tXC9ldS13ZXN0LTFfVlBOZ21lMzJNIiwiaW1vIjoiXCIqXCIiLCJhdXRoX3RpbWUiOjE3MDU5OTE2MjQsImV4cCI6MTcwNTk5NDYyMiwiaWF0IjoxNzA1OTkxNjI0LCJ3cml0ZV90b19teXNxbF90YWJsZXMiOiJcIipcIiIsImp0aSI6ImY5ZTAzOTQ3LWUyZDctNDZhNC04OGFkLTRkYmExZjE3NWYyZSIsImVtYWlsIjoic2hhaC5uaWtoaWxrdW1hckBsdHRzLmNvbSIsIm93bmVyIjoiXCIqXCIiLCJ1aV9zZXR0aW5ncyI6IlwiKlwiIiwiZW1haWxfdmVyaWZpZWQiOnRydWUsInBob25lX251bWJlcl92ZXJpZmllZCI6dHJ1ZSwiY29nbml0bzp1c2VybmFtZSI6ImFkbWluIiwib3JpZ2luX2p0aSI6ImNkMGRkOTM1LTk0MGItNDVkNy1iMjU1LWVkM2MxMWQ5M2FhOCIsImF1ZCI6IjFqN2xic3RjZjVlaHRubmIxczRnMDliOG5rIiwic2lnbmFscyI6IlwiKlwiIiwiZXZlbnRfaWQiOiIzMjNjMTFhMC1hMDFjLTQ3ZTctOTIwMy03N2U1NmE5NGUxNmMiLCJ0b2tlbl91c2UiOiJpZCIsInBob25lX251bWJlciI6Iis5MTk3MzkzNzI2NzMiLCJmYXZvcml0ZSI6IlwiKlwiIn0.h_BA6spWaeInhoBUuWVJ3ADdoFngA0aDJCZfGRPL475N8EDwrnz7GEH8tHxDUDo5CORfTO-cyVScdy0IY3-BIUr702C1V0geJFnRMcTjaoYaReQQYIZ0OXT3YEKR9nwhH2nmxwKlzSPodkiRpoV8QZIM8sOD_acf_lXw-Jw9Ph8gc1YaPGniWu2KmHRCwcwSQrKQCXZrGpj8CkpIsj_TSMiW_2-xZSq6_PjkYGwOgQKyYKajyWUfsTp2p1qAvEgmQvWDh5tn7IubGZZ2AX9YXPgoVOPV3fnDMWIXrx0KB8hwwryw90_FYBjoQdlwFdRWfPgLRiSgZ78Bwsftw2FHWA");
		Response response=request.post("api/v2.1/login");
		response.prettyPrint();
	 
}
}
