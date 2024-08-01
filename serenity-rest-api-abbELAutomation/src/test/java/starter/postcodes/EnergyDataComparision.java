package starter.postcodes;
import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
public class EnergyDataComparision {
	String Token="eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6IjJaUXBKM1VwYmpBWVhZR2FYRUpsOGxWMFRPSSIsImtpZCI6IjJaUXBKM1VwYmpBWVhZR2FYRUpsOGxWMFRPSSJ9.eyJhdWQiOiJhcGk6Ly82ZTcwZDFkNS0zYzQ4LTRjYWQtOGUzMi0xNjVmZmI4MGM5MjIiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8zNzJlZTllMC05Y2UwLTQwMzMtYTY0YS1jMDcwNzNhOTFlY2QvIiwiaWF0IjoxNjU4OTk5MDQ2LCJuYmYiOjE2NTg5OTkwNDYsImV4cCI6MTY1OTAwNDM2MCwiYWNyIjoiMSIsImFpbyI6IkFWUUFxLzhUQUFBQUZ3V3ArbVhwaE9mc0Rhc0p4SkV5UkczN25hcm5uYUZXRjdxTHplQ21QVFhVVmVuSGVhOEdkWjZSV0l0SFpLOEZwSGt2MXNGdnZ6c240SHlFaWpNR2hWZmVzUnJQNXNOUkpDZkdiQjNRdThVPSIsImFtciI6WyJwd2QiXSwiYXBwaWQiOiIyOWZiMDU3OS02ZWVjLTQ3MzQtYWY0Ni0zZTk0MzEwZTA1YzkiLCJhcHBpZGFjciI6IjAiLCJlbWFpbCI6ImFydW5rdW1hci5obkBsdHRzLmNvbSIsImZhbWlseV9uYW1lIjoiSE4iLCJnaXZlbl9uYW1lIjoiQXJ1biIsImlwYWRkciI6IjE2NS4yMjUuMTI0Ljk2IiwibmFtZSI6ImFydW5rdW1hci5obkBsdHRzLmNvbSIsIm9pZCI6IjIzZmVkMGFjLTdkZTktNGRmNC04M2IxLWQyOWU3NGM2ZjFlYiIsIm9ucHJlbV9zaWQiOiJTLTEtNS0yMS00MTM3NzIzOTc5LTU2NjYwMjQ3Ny0yODI3ODY0OTQxLTQ0MjUwODUiLCJyaCI6IjAuQVFJQTRPa3VOLUNjTTBDbVNzQndjNmtlemRYUmNHNUlQSzFNampJV1hfdUF5U0lDQUxRLiIsInNjcCI6ImVsYmFja2VuZCIsInN1YiI6Imp5QmlhVUlLRUQ0WjZTaUtQY3ZYZm1NZ1BsVTl6aTVlTFQwZ3A2cE1KOEEiLCJ0aWQiOiIzNzJlZTllMC05Y2UwLTQwMzMtYTY0YS1jMDcwNzNhOTFlY2QiLCJ1bmlxdWVfbmFtZSI6ImFydW5rdW1hci5obkBsdHRzLmNvbSIsInVwbiI6ImFydW5rdW1hci5obl9sdHRzLmNvbUBndWVzdC5hYmIuY29tIiwidXRpIjoiUlFoNnNOTEo1VWkwVGxxLTFpSXBBQSIsInZlciI6IjEuMCJ9.QaVY2S6dpHwrrNMSDYuKJeSpnsW4N32y9zcgxIhpNsOieIhrC_FAMs02cMpGPWG5aiscs9w0gkNvGsOKndZWzBK6sURPq6B9AlRLdZMHT54J0uNrE8n3lmpnR_GLGj7MCmZc100XKmikTQS0ZKGBj_TfFMvnFUjglFWHvzzGA2AmnuDSLB-gkqzPhzqVL-YdNLmZSfqNCEynuTNFJvwYF8bMDJQT-DVXZ1YO_vcVklLLS53ZaLsaiMDfqLyQejMtnUFSBmqIf3pfRdDCRQmp_Yn4854OtTHtghIz-uM9HCTnuZHsE58P1X-9VEGOOWyOpZ8bjiQ1uA0wCV-51x62vw";;
	
	String Url="https://electrificationapi-aps-stage-01.azurewebsites.net/api/";
    String Plant="plant/77903d8a-ba6e-4510-b1bb-d96f415f2120";
    //String Device="/device/";
    String Connectivity="/connectivity?plantType=EL&deviceType=EDCS";


    @Test
    public void getData(){
        Response response = SerenityRest.given()
                .queryParam("plantId", "77903d8a-ba6e-4510-b1bb-d96f415f2120")
                .queryParam("widgetId","2252d413-fdc5-4bae-82d4-d9e9f79404ab")
                .headers(
                        "Authorization",
                        "Bearer "+Token,
                        "Accept",
                        ContentType.JSON)
                .when()
                //.get("https://electrificationapi-aps-stage-01.azurewebsites.net/api/plants")
                .get("https://electrificationapi-aps-stage-01.azurewebsites.net/api/plants/77903d8a-ba6e-4510-b1bb-d96f415f2120/widget/2252d413-fdc5-4bae-82d4-d9e9f79404ab?isOptions=true&plantType=EDCS&isPageEnabled=true&page=1&pageSize=14")
                .then()
                .extract()
                .response();
        System.out.println(response.asString());
    }
}
