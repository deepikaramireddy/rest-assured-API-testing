package swaggerApiTesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PetSwaggerApiTesting {

    @Test
    public void fetchingPet1(){

        Response response= RestAssured
                .given()
                .when()
                .get("https://petstore.swagger.io/v2/pet/3");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void gettingPets(){

        Response response= RestAssured
                .given()
                .when()
                .get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void creatingPetPost(){

        Response response= RestAssured
                .given()
                .when()
                .post("https://petstore.swagger.io/v2/pet");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void updatingPet(){

        Response response= RestAssured
                .given()
                .when()
                .post("https://petstore.swagger.io/v2/pet/1");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void updatingPetImage(){

        Response response= RestAssured
                .given()
                .when()
                .post("https://petstore.swagger.io/v2/pet/1");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void modifyingPet1(){

        Response response= RestAssured
                .given()
                .when()
                .put("https://petstore.swagger.io/v2/pet");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void deletingPet1(){

        Response response= RestAssured
                .given()
                .when()
                .put("https://petstore.swagger.io/v2/pet/1");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }
}