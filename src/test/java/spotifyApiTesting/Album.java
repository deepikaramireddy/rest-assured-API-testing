package spotifyApiTesting;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Album {
    @Test
    void getAlbum(){
        String token="BQBACkWoZLWucKR6LQa6XQHXbbhTpVaNK1VvqT2JHZuQQsN2vNP9eZEVpQ0Epd392F_tu6ceCHVASAZ2xxyf1a_suWKZLrPv-rw3upWITLQCB15JX25cAJ9q9MsmTqK3bmZeiA-eDCPKUXFmtQ-G00AhZ-UMVu76EQfprtWFe27jXK_gJWvEMliBmzf9maBIvEAGE1PkElbBvAJzAlAJtF2ybXdJDGG7CALkykgHYd9VBq7FggrUDWulKfHJ1fHmaaq2L2uAcbABliV0c4S-1bfAkuMhw2aZi-YGc-kIOPpneNDKCczyRtj41GGUermymKfwN4bMlFKgHa0hSVQvRlzfueMUxKW0ghAPdBpYd0NNP5EeXpexc7fTl9AK";
        Response response=
                given()
                .header("Authorization","Bearer " + token)
                .when()
                .get("https://api.spotify.com/v1/albums/4aawyAB9vmqN3uQ7FjRGTy");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }
    @Test
    void getSeveralAlbums(){
        String token="BQBACkWoZLWucKR6LQa6XQHXbbhTpVaNK1VvqT2JHZuQQsN2vNP9eZEVpQ0Epd392F_tu6ceCHVASAZ2xxyf1a_suWKZLrPv-rw3upWITLQCB15JX25cAJ9q9MsmTqK3bmZeiA-eDCPKUXFmtQ-G00AhZ-UMVu76EQfprtWFe27jXK_gJWvEMliBmzf9maBIvEAGE1PkElbBvAJzAlAJtF2ybXdJDGG7CALkykgHYd9VBq7FggrUDWulKfHJ1fHmaaq2L2uAcbABliV0c4S-1bfAkuMhw2aZi-YGc-kIOPpneNDKCczyRtj41GGUermymKfwN4bMlFKgHa0hSVQvRlzfueMUxKW0ghAPdBpYd0NNP5EeXpexc7fTl9AK";
        Response response=
                given()
                        .header("Authorization","Bearer " + token)
                        .when()
                        .get("https://api.spotify.com/v1/albums?ids=382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }
    @Test
    void getAlbumTracks(){
        String token="BQBACkWoZLWucKR6LQa6XQHXbbhTpVaNK1VvqT2JHZuQQsN2vNP9eZEVpQ0Epd392F_tu6ceCHVASAZ2xxyf1a_suWKZLrPv-rw3upWITLQCB15JX25cAJ9q9MsmTqK3bmZeiA-eDCPKUXFmtQ-G00AhZ-UMVu76EQfprtWFe27jXK_gJWvEMliBmzf9maBIvEAGE1PkElbBvAJzAlAJtF2ybXdJDGG7CALkykgHYd9VBq7FggrUDWulKfHJ1fHmaaq2L2uAcbABliV0c4S-1bfAkuMhw2aZi-YGc-kIOPpneNDKCczyRtj41GGUermymKfwN4bMlFKgHa0hSVQvRlzfueMUxKW0ghAPdBpYd0NNP5EeXpexc7fTl9AK";
        Response response=
                given()
                        .header("Authorization","Bearer " + token)
                        .when()
                        .get("https://api.spotify.com/v1/albums/4aawyAB9vmqN3uQ7FjRGTy/tracks");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }
    @Test
    void getUsersSavedAlbum(){
        String token="BQBACkWoZLWucKR6LQa6XQHXbbhTpVaNK1VvqT2JHZuQQsN2vNP9eZEVpQ0Epd392F_tu6ceCHVASAZ2xxyf1a_suWKZLrPv-rw3upWITLQCB15JX25cAJ9q9MsmTqK3bmZeiA-eDCPKUXFmtQ-G00AhZ-UMVu76EQfprtWFe27jXK_gJWvEMliBmzf9maBIvEAGE1PkElbBvAJzAlAJtF2ybXdJDGG7CALkykgHYd9VBq7FggrUDWulKfHJ1fHmaaq2L2uAcbABliV0c4S-1bfAkuMhw2aZi-YGc-kIOPpneNDKCczyRtj41GGUermymKfwN4bMlFKgHa0hSVQvRlzfueMUxKW0ghAPdBpYd0NNP5EeXpexc7fTl9AK";
        Response response=
                given()
                        .header("Authorization","Bearer " + token)
                        .when()
                        .get("https://api.spotify.com/v1/me/albums");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }
    @Test
    void getNewRelease(){
        String token="BQBACkWoZLWucKR6LQa6XQHXbbhTpVaNK1VvqT2JHZuQQsN2vNP9eZEVpQ0Epd392F_tu6ceCHVASAZ2xxyf1a_suWKZLrPv-rw3upWITLQCB15JX25cAJ9q9MsmTqK3bmZeiA-eDCPKUXFmtQ-G00AhZ-UMVu76EQfprtWFe27jXK_gJWvEMliBmzf9maBIvEAGE1PkElbBvAJzAlAJtF2ybXdJDGG7CALkykgHYd9VBq7FggrUDWulKfHJ1fHmaaq2L2uAcbABliV0c4S-1bfAkuMhw2aZi-YGc-kIOPpneNDKCczyRtj41GGUermymKfwN4bMlFKgHa0hSVQvRlzfueMUxKW0ghAPdBpYd0NNP5EeXpexc7fTl9AK";
        Response response=
                given()
                        .header("Authorization","Bearer " + token)
                        .when()
                        .get("https://api.spotify.com/v1/browse/new-releases");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }

    @Test
    void saveAlbumsForCurrentUSer(){
        String token="BQBACkWoZLWucKR6LQa6XQHXbbhTpVaNK1VvqT2JHZuQQsN2vNP9eZEVpQ0Epd392F_tu6ceCHVASAZ2xxyf1a_suWKZLrPv-rw3upWITLQCB15JX25cAJ9q9MsmTqK3bmZeiA-eDCPKUXFmtQ-G00AhZ-UMVu76EQfprtWFe27jXK_gJWvEMliBmzf9maBIvEAGE1PkElbBvAJzAlAJtF2ybXdJDGG7CALkykgHYd9VBq7FggrUDWulKfHJ1fHmaaq2L2uAcbABliV0c4S-1bfAkuMhw2aZi-YGc-kIOPpneNDKCczyRtj41GGUermymKfwN4bMlFKgHa0hSVQvRlzfueMUxKW0ghAPdBpYd0NNP5EeXpexc7fTl9AK";
        String putData="{\n" +
                "    \"ids\": [\n" +
                "        \n" +
                "        \"2noRn2Aes5aoNVsU6iWThc\"\n" +
                "    ]\n" +
                "}";
        Response response=
                given()
                        .header("Authorization","Bearer " + token)
                        .when()
                        .body(putData)
                        .put("https://api.spotify.com/v1/me/albums?ids=2noRn2Aes5aoNVsU6iWThc");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }

    @Test
    void checkUsersSavedAlbum(){
        String token="BQBACkWoZLWucKR6LQa6XQHXbbhTpVaNK1VvqT2JHZuQQsN2vNP9eZEVpQ0Epd392F_tu6ceCHVASAZ2xxyf1a_suWKZLrPv-rw3upWITLQCB15JX25cAJ9q9MsmTqK3bmZeiA-eDCPKUXFmtQ-G00AhZ-UMVu76EQfprtWFe27jXK_gJWvEMliBmzf9maBIvEAGE1PkElbBvAJzAlAJtF2ybXdJDGG7CALkykgHYd9VBq7FggrUDWulKfHJ1fHmaaq2L2uAcbABliV0c4S-1bfAkuMhw2aZi-YGc-kIOPpneNDKCczyRtj41GGUermymKfwN4bMlFKgHa0hSVQvRlzfueMUxKW0ghAPdBpYd0NNP5EeXpexc7fTl9AK";
        Response response=
                given()
                        .header("Authorization","Bearer " + token)
                        .when()
                        .get("https://api.spotify.com/v1/me/albums/contains?ids=382ObEPsp2rxGrnsizN5TX%2C1A2GTWGtFfWp7KSQTwWOyo%2C2noRn2Aes5aoNVsU6iWThc");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }

    @Test
    void removeUsersSavedAlbums(){
        String token="BQBACkWoZLWucKR6LQa6XQHXbbhTpVaNK1VvqT2JHZuQQsN2vNP9eZEVpQ0Epd392F_tu6ceCHVASAZ2xxyf1a_suWKZLrPv-rw3upWITLQCB15JX25cAJ9q9MsmTqK3bmZeiA-eDCPKUXFmtQ-G00AhZ-UMVu76EQfprtWFe27jXK_gJWvEMliBmzf9maBIvEAGE1PkElbBvAJzAlAJtF2ybXdJDGG7CALkykgHYd9VBq7FggrUDWulKfHJ1fHmaaq2L2uAcbABliV0c4S-1bfAkuMhw2aZi-YGc-kIOPpneNDKCczyRtj41GGUermymKfwN4bMlFKgHa0hSVQvRlzfueMUxKW0ghAPdBpYd0NNP5EeXpexc7fTl9AK";
        Response response=
                given()
                        .header("Authorization","Bearer " + token)
                        .when()
                        .delete("https://api.spotify.com/v1/me/albums?ids=382ObEPsp2rxGrnsizN5TX%2C1A2GTWGtFfWp7KSQTwWOyo%2C2noRn2Aes5aoNVsU6iWThc");
        response.prettyPrint();
        response.then()
                .statusCode(200)
                .log().all();
    }
}