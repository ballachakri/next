package com.next.apitests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

/**
 * Post Request
 * ObjectMapper, ObjectNode and ArrayNode
 */
public class PostReqObjectMapper1 {

    ObjectMapper mapper;
    ObjectNode empData;
    ArrayNode empAddress;

    @Before
    public void generateData() {

        mapper=new ObjectMapper();
// Creating json object node

        empData=mapper.createObjectNode();

        empData.put("emp id",245);
        empData.put("firstName","chakra");
        empData.put("lastName","balla");
        empData.put("dob","12-10-1978");

// creating json array

        empAddress=mapper.createArrayNode();
        empAddress.add("41");
        empAddress.add("Heron Mews");
        empAddress.add("Ilford");
        empAddress.add("IG1 4NW");

        empData.set("Address",empAddress);
    }
@Test

   public void postReqDemo4() {

    String str=empData.toString();
    System.out.println(str);

    given()
            .baseUri("http://restapi.demoqa.com/customer")
            .basePath("/register")
            .contentType("application/json")
            .body(str)
    .when()
      //      .post()
    .then()
            .statusCode(200)
            .statusLine("HTTP/1.1 200 OK")
    .and()
            .body("SuccessCode", equalTo("OPERATION_SUCCESS"))
            .body("Message", equalTo("Operation completed successfully"))
            .log().all();
    }
}

