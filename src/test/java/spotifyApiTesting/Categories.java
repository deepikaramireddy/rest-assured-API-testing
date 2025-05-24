package spotifyApiTesting;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Categories {
    @Test
    void getSeveralBrowseCategories(){
        String token="BQAyvf56KnMiiFMbQ_y0H9nQzP7DfaT2m694ss9jT7_YzVJAtV9YP0aWOCW0FUhdWjWPXgUlpGItDejQI8B5KOXAK4sLBqA_DMcCCYG3BgARCcxPc01l0FWhOoRMpL05pN6AT_E_oTj0pNC5TjEkUpmgWzUuDHtDBfj2rg2Hx3lCRdFPiaEuHeQYuZYQwH7Z-8P5C49ipLooSnElWHKrEOnu2KzR6cfgrVaNDddRIeCcQ9Xuselcdy9thlm-Taz3lpYr3wizizYsntuPLD5HsKtiWG98-dVNjw68_NJQ15oXa6EkvQnP1-VmhJr-Ra5q6ESgOXs2sl37QBvUIynzuwMfT5Efm_cba3Jze-v5KIWBJ27rd1dnpJhfzgzp";
        Response response=
                given()
                        .header("Authorization","Bearer " + token)
                        .when()
                        .get("https://api.spotify.com/v1/browse/categories");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }

    @Test
    void getSingleBrowseCategory(){
        String token="BQAyvf56KnMiiFMbQ_y0H9nQzP7DfaT2m694ss9jT7_YzVJAtV9YP0aWOCW0FUhdWjWPXgUlpGItDejQI8B5KOXAK4sLBqA_DMcCCYG3BgARCcxPc01l0FWhOoRMpL05pN6AT_E_oTj0pNC5TjEkUpmgWzUuDHtDBfj2rg2Hx3lCRdFPiaEuHeQYuZYQwH7Z-8P5C49ipLooSnElWHKrEOnu2KzR6cfgrVaNDddRIeCcQ9Xuselcdy9thlm-Taz3lpYr3wizizYsntuPLD5HsKtiWG98-dVNjw68_NJQ15oXa6EkvQnP1-VmhJr-Ra5q6ESgOXs2sl37QBvUIynzuwMfT5Efm_cba3Jze-v5KIWBJ27rd1dnpJhfzgzp";
        Response response=
                given()
                        .header("Authorization","Bearer " + token)
                        .when()
                        .get("https://api.spotify.com/v1/browse/categories/dinner");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }
}