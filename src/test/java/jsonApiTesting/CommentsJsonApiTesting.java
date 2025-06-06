package jsonApiTesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class CommentsJsonApiTesting {

    @Test
    public void testGetRequest(){
        RestAssured.baseURI="http://localhost:3000/comments";
        Response response=RestAssured
                .given()
                .when()
                .get("/posts");
        response.prettyPrint();
    }

    @Test
    public void addingDetails(){
        //RestAssured.baseURI="http://localhost:3000/posts";
        String postData="{\n" +
                "        \"id\": \"8\",\n" +
                "        \"body\": \"Nicely\",\n" +
                "        \"postId\": 8\n" +
                "    }";
        Response postResponse=RestAssured
                .given()
                .when()
                .body(postData)
                .post("http://localhost:3000/comments");
        postResponse.prettyPrint();
        postResponse
                .then()
                .statusCode(201)
                .log().all();
    }

    @Test
    public void updatingResource(){
        String putData="{\n" +
                "        \"id\": \"1\",\n" +
                "        \"body\": \"Welcome here\",\n" +
                "        \"postId\": 2\n" +
                "    }";

        Response putResponse=RestAssured
                .given()
                .when()
                .body(putData)
                .put("http://localhost:3000/comments/1");
        putResponse.prettyPrint();

        putResponse.then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void resourceModification(){
        String patchData="{\n" +
                "        \"id\": \"6\",\n" +
                "        \"body\": \"Welcome\",\n" +
                "        \"postId\": 1\n" +
                "    }";
        Response patchResponse=RestAssured
                .given()
                .when()
                .body(patchData)
                .patch("http://localhost:3000/comments/1");
        patchResponse.prettyPrint();

        patchResponse.then()
                .statusCode(200)
                .log().all();

    }

    @Test
    public void resourceDelete(){
//        String patchData="{\n" +
//                "        \"id\": \"7\",\n" +
//                "        \"title\": \"Selenium with python\",\n" +
//                "        \"author\": \"Pooja\"\n" +
//                "    }";
        Response patchResponse=RestAssured
                .given()
                .when()
//                .body(patchData)
                .delete("http://localhost:3000/posts/3");
        patchResponse.prettyPrint();

        patchResponse.then()
                .statusCode(200)
                .log().all();
    }
}