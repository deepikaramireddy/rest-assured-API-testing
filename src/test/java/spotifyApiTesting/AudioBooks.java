package spotifyApiTesting;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AudioBooks {
    @Test
    void getAudioBooks(){
        String token="BQAyvf56KnMiiFMbQ_y0H9nQzP7DfaT2m694ss9jT7_YzVJAtV9YP0aWOCW0FUhdWjWPXgUlpGItDejQI8B5KOXAK4sLBqA_DMcCCYG3BgARCcxPc01l0FWhOoRMpL05pN6AT_E_oTj0pNC5TjEkUpmgWzUuDHtDBfj2rg2Hx3lCRdFPiaEuHeQYuZYQwH7Z-8P5C49ipLooSnElWHKrEOnu2KzR6cfgrVaNDddRIeCcQ9Xuselcdy9thlm-Taz3lpYr3wizizYsntuPLD5HsKtiWG98-dVNjw68_NJQ15oXa6EkvQnP1-VmhJr-Ra5q6ESgOXs2sl37QBvUIynzuwMfT5Efm_cba3Jze-v5KIWBJ27rd1dnpJhfzgzp";
        Response response=
                given()
                        .header("Authorization","Bearer " + token)
                        .when()
                        .get("https://api.spotify.com/v1/artists/0TnOYISbd1XYRBk9myaseg");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }
    @Test
    void getSeveralAudioBooks(){
        String token="BQAyvf56KnMiiFMbQ_y0H9nQzP7DfaT2m694ss9jT7_YzVJAtV9YP0aWOCW0FUhdWjWPXgUlpGItDejQI8B5KOXAK4sLBqA_DMcCCYG3BgARCcxPc01l0FWhOoRMpL05pN6AT_E_oTj0pNC5TjEkUpmgWzUuDHtDBfj2rg2Hx3lCRdFPiaEuHeQYuZYQwH7Z-8P5C49ipLooSnElWHKrEOnu2KzR6cfgrVaNDddRIeCcQ9Xuselcdy9thlm-Taz3lpYr3wizizYsntuPLD5HsKtiWG98-dVNjw68_NJQ15oXa6EkvQnP1-VmhJr-Ra5q6ESgOXs2sl37QBvUIynzuwMfT5Efm_cba3Jze-v5KIWBJ27rd1dnpJhfzgzp";
        Response response=
                given()
                        .header("Authorization","Bearer " + token)
                        .when()
                        .get("https://api.spotify.com/v1/artists/0TnOYISbd1XYRBk9myaseg");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }
    @Test
    void getAudioBooksChapters(){
        String token="BQAyvf56KnMiiFMbQ_y0H9nQzP7DfaT2m694ss9jT7_YzVJAtV9YP0aWOCW0FUhdWjWPXgUlpGItDejQI8B5KOXAK4sLBqA_DMcCCYG3BgARCcxPc01l0FWhOoRMpL05pN6AT_E_oTj0pNC5TjEkUpmgWzUuDHtDBfj2rg2Hx3lCRdFPiaEuHeQYuZYQwH7Z-8P5C49ipLooSnElWHKrEOnu2KzR6cfgrVaNDddRIeCcQ9Xuselcdy9thlm-Taz3lpYr3wizizYsntuPLD5HsKtiWG98-dVNjw68_NJQ15oXa6EkvQnP1-VmhJr-Ra5q6ESgOXs2sl37QBvUIynzuwMfT5Efm_cba3Jze-v5KIWBJ27rd1dnpJhfzgzp";
        Response response=
                given()
                        .header("Authorization","Bearer " + token)
                        .when()
                        .get("https://api.spotify.com/v1/artists/0TnOYISbd1XYRBk9myaseg/albums");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }
    @Test
    void getUsersAudioBooks(){
        String token="BQAyvf56KnMiiFMbQ_y0H9nQzP7DfaT2m694ss9jT7_YzVJAtV9YP0aWOCW0FUhdWjWPXgUlpGItDejQI8B5KOXAK4sLBqA_DMcCCYG3BgARCcxPc01l0FWhOoRMpL05pN6AT_E_oTj0pNC5TjEkUpmgWzUuDHtDBfj2rg2Hx3lCRdFPiaEuHeQYuZYQwH7Z-8P5C49ipLooSnElWHKrEOnu2KzR6cfgrVaNDddRIeCcQ9Xuselcdy9thlm-Taz3lpYr3wizizYsntuPLD5HsKtiWG98-dVNjw68_NJQ15oXa6EkvQnP1-VmhJr-Ra5q6ESgOXs2sl37QBvUIynzuwMfT5Efm_cba3Jze-v5KIWBJ27rd1dnpJhfzgzp";
        Response response=
                given()
                        .header("Authorization","Bearer " + token)
                        .when()
                        .get("https://api.spotify.com/v1/artists/0TnOYISbd1XYRBk9myaseg/top-tracks");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }
    @Test
    void checkUsersSavedAudioBooks(){
        String token="BQAyvf56KnMiiFMbQ_y0H9nQzP7DfaT2m694ss9jT7_YzVJAtV9YP0aWOCW0FUhdWjWPXgUlpGItDejQI8B5KOXAK4sLBqA_DMcCCYG3BgARCcxPc01l0FWhOoRMpL05pN6AT_E_oTj0pNC5TjEkUpmgWzUuDHtDBfj2rg2Hx3lCRdFPiaEuHeQYuZYQwH7Z-8P5C49ipLooSnElWHKrEOnu2KzR6cfgrVaNDddRIeCcQ9Xuselcdy9thlm-Taz3lpYr3wizizYsntuPLD5HsKtiWG98-dVNjw68_NJQ15oXa6EkvQnP1-VmhJr-Ra5q6ESgOXs2sl37QBvUIynzuwMfT5Efm_cba3Jze-v5KIWBJ27rd1dnpJhfzgzp";
        Response response=
                given()
                        .header("Authorization","Bearer " + token)
                        .when()
                        .get("https://api.spotify.com/v1/artists/0TnOYISbd1XYRBk9myaseg");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }

    @Test
    void saveAudioBooksForCurrentUsers(){
        String token="BQD_i6PYU7HGuSpBRVzkXpczJuZKmSWZ_Edu-noIca0m7W2qnY_nlEEnbiqYmPY8YHzFj-GXsUzcRhWLBAZzFYtpT9y9KtHs17hfkXTb0DoomXrw8iqDTSTk25vokcS1hzwpBFrELvrdgnl1mQZgdutfVGLmN04CoqyDnHYp7B7lQMdwf4n2Y7ocwEXhE_99Ft95Dj9pLt4sN8NeE8RjOSWbpvYUz1SPOQhmaR3zboVjuOGD44aL4hVQseWCqYc0rcelNyBLFiBWTMBFBckaRNQr509fXsdaV-2DQMWsfxQOWIsHeLYToj4YhlGiOKJBRGANwJcHRf2_rXmjMApRlEavXk0HPBIOkO55V_B9DrSA1AkafUvT0JooVao8";
        Response response=
                given()
                        .header("Authorization","Bearer " + token)
                        .when()
                        .put("https://api.spotify.com/v1/me/audiobooks?ids=18yVqkdbdRvS24c0Ilj2ci%2C1HGw3J3NxZO1TP1BTtVhpZ%2C7iHfbu1YPACw6oZPAFJtqe");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }

    @Test
    void removeUsersSavedAudioBooks(){
        String token="BQAyvf56KnMiiFMbQ_y0H9nQzP7DfaT2m694ss9jT7_YzVJAtV9YP0aWOCW0FUhdWjWPXgUlpGItDejQI8B5KOXAK4sLBqA_DMcCCYG3BgARCcxPc01l0FWhOoRMpL05pN6AT_E_oTj0pNC5TjEkUpmgWzUuDHtDBfj2rg2Hx3lCRdFPiaEuHeQYuZYQwH7Z-8P5C49ipLooSnElWHKrEOnu2KzR6cfgrVaNDddRIeCcQ9Xuselcdy9thlm-Taz3lpYr3wizizYsntuPLD5HsKtiWG98-dVNjw68_NJQ15oXa6EkvQnP1-VmhJr-Ra5q6ESgOXs2sl37QBvUIynzuwMfT5Efm_cba3Jze-v5KIWBJ27rd1dnpJhfzgzp";
        Response response=
                given()
                        .header("Authorization","Bearer " + token)
                        .when()
                        .delete("https://api.spotify.com/v1/artists/0TnOYISbd1XYRBk9myaseg");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }
}