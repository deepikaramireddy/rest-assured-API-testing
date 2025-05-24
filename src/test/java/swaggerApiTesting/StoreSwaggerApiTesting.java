package swaggerApiTesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class StoreSwaggerApiTesting {

    @Test
    public void findingPurchaseOrder() {

        Response response = RestAssured
                .given()
                .when()
                .get("https://petstore.swagger.io/v2/store/order/1");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void returnsPetInventories() {

        Response response = RestAssured
                .given()
                .when()
                .get("https://petstore.swagger.io/v2/store/inventory");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void placeOrder() {

        String postData = "{\n" +
                "  \"id\": 1,\n" +
                "  \"petId\": 1,\n" +
                "  \"quantity\": 0,\n" +
                "  \"shipDate\": \"2025-03-28T10:56:34.065+0000\",\n" +
                "  \"status\": \"placed\",\n" +
                "  \"complete\": true\n" +
                "}";
        Response response = RestAssured
                .given()
                .when()
                .body(postData)
                .post("https://petstore.swagger.io/v2/store/order");
        response.prettyPrint();
        response.then()
                .statusCode(201)
                .log().all();
    }

    @Test
    public void deletingPurchaseOrder1() {

        Response response = RestAssured
                .given()
                .when()
                .delete("https://petstore.swagger.io/v2/store/order/1");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }
}