package swaggerApiTesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class UserSwaggerApiTesting {
    @Test
    public void userLogin(){

        Response response= RestAssured
                .given()
                .when()
                .get("https://petstore.swagger.io/v2/user/login?username=Deepika&password=Deepa%40111");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void gettingUser(){

        Response response= RestAssured
                .given()
                .when()
                .get("https://petstore.swagger.io/v2/user/Deepika");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void createUser(){

        String postData="{\n" +
                "  \"code\": 200,\n" +
                "  \"type\": \"unknown\",\n" +
                "  \"message\": \"101\"\n" +
                "}";
        Response response= RestAssured
                .given()
                .when()
                .body(postData)
                .post("https://petstore.swagger.io/v2/user");
        response.prettyPrint();
        response.then()
                .statusCode(201)
                .log().all();
    }

    @Test
    public void updatingUser(){

        String putData="{\n" +
                "  \"code\": 200,\n" +
                "  \"type\": \"unknown\",\n" +
                "  \"message\": \"9223372036854755977\"\n" +
                "}";
        Response response= RestAssured
                .given()
                .when()
                .body(putData)
                .put("https://petstore.swagger.io/v2/user/string");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void deletingUser(){

        Response response= RestAssured
                .given()
                .when()
                .delete("https://petstore.swagger.io/v2/user/string");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }
}