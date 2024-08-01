package starter.postcodes;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;

public class TotalHistoryEnergyDataAPI {

    
    String Token="eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6IjJaUXBKM1VwYmpBWVhZR2FYRUpsOGxWMFRPSSIsImtpZCI6IjJaUXBKM1VwYmpBWVhZR2FYRUpsOGxWMFRPSSJ9.eyJhdWQiOiJhcGk6Ly82ZTcwZDFkNS0zYzQ4LTRjYWQtOGUzMi0xNjVmZmI4MGM5MjIiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8zNzJlZTllMC05Y2UwLTQwMzMtYTY0YS1jMDcwNzNhOTFlY2QvIiwiaWF0IjoxNjU5MDEyODQ2LCJuYmYiOjE2NTkwMTI4NDYsImV4cCI6MTY1OTAxNjg0NCwiYWNyIjoiMSIsImFpbyI6IkFWUUFxLzhUQUFBQTB2em1mNndWK2kzTGJicjVVYUFYSzRLRnFNVXA1K0RiWU5pUTBRVUZ6enZ3Wnk5SWJFWXozQXMvdzV0QkFGdVYyQ1A3MlMvRWhZamdsWVdXN04rWnloNVZvRk1oenVZTHZ3dXZnbmN5Q1NBPSIsImFtciI6WyJwd2QiXSwiYXBwaWQiOiIyOWZiMDU3OS02ZWVjLTQ3MzQtYWY0Ni0zZTk0MzEwZTA1YzkiLCJhcHBpZGFjciI6IjAiLCJlbWFpbCI6ImFydW5rdW1hci5obkBsdHRzLmNvbSIsImZhbWlseV9uYW1lIjoiSE4iLCJnaXZlbl9uYW1lIjoiQXJ1biIsImlwYWRkciI6IjE2NS4yMjUuMTI0Ljk2IiwibmFtZSI6ImFydW5rdW1hci5obkBsdHRzLmNvbSIsIm9pZCI6IjIzZmVkMGFjLTdkZTktNGRmNC04M2IxLWQyOWU3NGM2ZjFlYiIsIm9ucHJlbV9zaWQiOiJTLTEtNS0yMS00MTM3NzIzOTc5LTU2NjYwMjQ3Ny0yODI3ODY0OTQxLTQ0MjUwODUiLCJyaCI6IjAuQVFJQTRPa3VOLUNjTTBDbVNzQndjNmtlemRYUmNHNUlQSzFNampJV1hfdUF5U0lDQUxRLiIsInNjcCI6ImVsYmFja2VuZCIsInN1YiI6Imp5QmlhVUlLRUQ0WjZTaUtQY3ZYZm1NZ1BsVTl6aTVlTFQwZ3A2cE1KOEEiLCJ0aWQiOiIzNzJlZTllMC05Y2UwLTQwMzMtYTY0YS1jMDcwNzNhOTFlY2QiLCJ1bmlxdWVfbmFtZSI6ImFydW5rdW1hci5obkBsdHRzLmNvbSIsInVwbiI6ImFydW5rdW1hci5obl9sdHRzLmNvbUBndWVzdC5hYmIuY29tIiwidXRpIjoiaVFIQW5BNDNJMENUVGx4XzJBRXRBQSIsInZlciI6IjEuMCJ9.KY5AOLgt1GGa16lcpRMc7oSoF2RoD-gn-6Opnc-cDsnBhua-Lw3ZlJ0KJyXHeLoTfiXn56VTn80YHR7Y41b2ZoHsc7on70w9tK-CxLC0MYmHJMhNh-CaWPF0WQ6hewEHxRcJ6is1XRHQ8qbEHVLAWrN6jJR9Kef3UCGLtPtjqRPKOECLKoLj-AZvSaKvZgm4O5ix9E225XJjPpJOjiR1Laz9JwfUhXCt26sBf4zYQKyi2bDyvOQFLbECcljD_ZDNA9LloBrEnd7-BJfP2HYWzJRv63herVzBbIfpOVg0KpYVwkBtzanxStZ7MN55Pr2hP_ABAgcpQfwqYtHpzH6aCw";
	
    String Url="https://electrificationapi-aps-stage-01.azurewebsites.net/api/";
    String Plant="plant/77903d8a-ba6e-4510-b1bb-d96f415f2120";
    //String Device="/device/";
    String Connectivity="/connectivity?plantType=EL&deviceType=EDCS";


    @Test
    public void getData() throws JsonMappingException, JsonProcessingException{
        Response response = SerenityRest.given()
                .queryParam("plantId", "77903d8a-ba6e-4510-b1bb-d96f415f2120")
                .queryParam("widgetId","c11c04d7-7430-46a0-a406-6328509a0a12")
                .headers(
                        "Authorization",
                        "Bearer "+Token,
                        "Accept",
                        ContentType.JSON)
                .when()
                //.get("https://electrificationapi-aps-stage-01.azurewebsites.net/api/plants")
                .get("https://electrificationapi-aps-stage-01.azurewebsites.net/api/plants/77903d8a-ba6e-4510-b1bb-d96f415f2120/widget/c11c04d7-7430-46a0-a406-6328509a0a12?isOptions=true&plantType=EDCS&isPageEnabled=true&page=1&pageSize=14")
            .then()
        .extract()
        .response();
        System.out.println(response.asString());

        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode;
        jsonNode = (mapper.readTree(response.asString()));

        String code = (jsonNode.findValue("code")).asText();
        String message = (jsonNode.findValue("message")).asText();
        System.out.println("");
        System.out.println("==================================");
        Assert.assertEquals(code, "Success");
        System.out.println("Device Status: "+code);
        Assert.assertEquals(message, "Widget details retrieved successfully.");
        System.out.println("Response Message : "+message);

    }
}
