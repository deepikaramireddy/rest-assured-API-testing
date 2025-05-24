package jsonApiTesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ProfileJsonApiTesting {
    @Test
    public void testGetRequest(){

//        String data="{\n" +
//                "    \"name\": \"Deeksha\"\n" +
//                "}";
        Response response=RestAssured
                .given()
                .when()
//                .body(data)
                .get("http://localhost:3000/profile");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }
}