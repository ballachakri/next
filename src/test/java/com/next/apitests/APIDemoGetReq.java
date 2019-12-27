package com.next.apitests;

import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

/**
 * Validation of JSON response
 * URI =http://restapi.demoqa.com/utilities/weather/city/Hyderabad
 * URI =
 */
public class APIDemoGetReq {
    // here we are validating status code, status line , header and status body
    @Test
    public void getReq1() {
        given()

                .when()
                .get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
                .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .header("Content-Type", "application/json")
                .body("City", equalTo("Hyderabad"))
                // assertion can also be done as below
                .assertThat().body("City", equalTo("Hyderabad"))
                .log().all();
    }

    // same as above but in BDD format.
    @Test
    public void getReq2() {
        given().when().get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad").then().statusCode(200).body("City", equalTo("Hyderabad")).log().all();
    }
}
