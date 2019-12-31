package com.next.apitests;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

/**
 * API POST request
 * JsonFactory, JsonGenerator
 * JsonGenerator provides writeStartObject and writeStartArray methods
 */
public class PostReqJsonGenerator {

    @Before
    public void generateJsonData() throws IOException {

// initialize JsonFactory
        JsonFactory factory=new JsonFactory();
// get JsonGenerator  to create json file
        JsonGenerator generator=factory.createGenerator(new FileWriter(new File("src/test/java/com/next/apitests/customer.json")));

        generator.writeStartObject();
// writing key to JSON object
        generator.writeFieldName("FirstName");
// writing value to JSON object
        generator.writeString("chakra");
        generator.writeFieldName("LastName");
        generator.writeString("balla");
        generator.writeFieldName("UserName");
        generator.writeString("chakraballa");
        generator.writeFieldName("Password");
        generator.writeString("chakra123");
        generator.writeFieldName("Email");
        generator.writeString("chakra@yahoo.com");
// writing Array to JSON object
        generator.writeFieldName("address");
        generator.writeStartArray();
        generator.writeNumber(43);
        generator.writeString("Heron Mews");
        generator.writeString("Ilford");
        generator.writeString("IG1 4NW");
        generator.writeEndArray();
        generator.writeEndObject();
        generator.close();
        }

    @Test
    public void pestReqDemo2() {


        given()
                .baseUri("http://restapi.demoqa.com/customer")
                .basePath("/register")
                .contentType("application/json")
          //      .body("src/test/java/com/next/apitests/customer.json")
        .when()
          //      .post()
        .then()
                .statusCode(200)
        .and()
                .body("SuccessCode", equalTo("OPERATION_SUCCESS"))
                .body("Message", equalTo("Operation completed successfully"))
                .log().all();
    }
}
