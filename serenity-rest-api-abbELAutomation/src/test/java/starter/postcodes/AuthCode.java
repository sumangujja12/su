package starter.postcodes;


import io.cucumber.java.Before;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



import ch.qos.logback.core.net.SyslogOutputStream;



import static io.restassured.RestAssured.given;

import java.util.Base64;

//import org.assertj.core.api.Assertions;
//import org.junit.Test;


public class AuthCode {



public static String clientId = "29fb0579-6eec-4734-af46-3e94310e05c9";
public static String redirectUri = "https://stage.sitemanager.ability.abb/";
public static String scope = "api%3A%2F%2F6e70d1d5-3c48-4cad-8e32-165ffb80c922%2Felbackend";
public static String username = "arunkumar.hn@ltts.com";
public static String password = "Testing@123";
public static String code;

public static String encode(String str1, String str2) {
return new String(Base64.getEncoder().encode((str1 + ":" + str2).getBytes()));
}




public static Response getCode() {
String authorization = encode(username, password);



return
given()
.header("authorization", "Basic " + authorization)
.contentType(ContentType.URLENC)
.formParam("response_type", "code")
.queryParam("client_id", clientId)
.queryParam("redirect_uri", redirectUri)
.queryParam("scope", scope)
.post("https://login.microsoftonline.com/372ee9e0-9ce0-4033-a64a-c07073a91ecd/oauth2/v2.0/authorize?response_mode=query&scope=api%3A%2F%2F6e70d1d5-3c48-4cad-8e32-165ffb80c922%2Felbackend")
.then()
.statusCode(200)
.extract()
.response();
}


public static String parseForOAuth2Code(Response response) {


return response.jsonPath().toString();

//getString("code");
}

@Before
public static void setup() {
RestAssured.baseURI = "https://login.microsoftonline.com/372ee9e0-9ce0-4033-a64a-c07073a91ecd/oauth2/v2.0/authorize?response_mode=query&scope=api%3A%2F%2F6e70d1d5-3c48-4cad-8e32-165ffb80c922%2Felbackend";
}




public static void main(String[] args) {

Response response = getCode();
code = parseForOAuth2Code(response);
System.out.println(code.substring(34, 42));
Assertions.assertNotNull(code);
}



//public static Response getToken(String authCode) {
//    String authorization = encode(username, password);
//
//    return
//        given()
//            .header("authorization", "Basic " + authorization)
//            .contentType(ContentType.URLENC)
//            .queryParam("code", code.substring(34, 42))
//            .queryParam("redirect_uri", redirectUri)
//            .queryParam("grant_type", "authorization code")
//            .post("/oauth2/token")
//            .then()
//            .statusCode(200)
//            .extract()
//            .response();
//    }
//
//    public static String parseForAccessToken(Response loginResponse) {
//        return loginResponse.jsonPath().getString("access_token");
//    }
//
//    @Test
//    public void iShouldGetToken() {
//        Response tokenResponse = getToken(code);
//        String accessToken = parseForAccessToken(tokenResponse);
//        Assertions.assertNotNull(accessToken);
//    }
}
