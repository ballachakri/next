package com.next.apitests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.Before;
import org.junit.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

/**
 * API POST request
 * JsonNodeFactory, ObjectNode and ArrayNode
 */
public class PostReqJsonNodeFactory {

//  Creating JSON object on fly with JsonNodeFactory and ObjectNode
    JsonNodeFactory factory;
//  we use ObjectNode for the JSON key- value Data
    ObjectNode customerData;
// we use ArrayNode for the JSON array
    ArrayNode customerAddress;

    @Before
    public void getData() {

        factory = new JsonNodeFactory(false);
//Getting ObjectNode from JsonNodeFactory
        customerData = factory.objectNode();
// Adding key value pairs
        customerData.put("FirstName", "aabbssssss");
        customerData.put("LastName", "aabbssssss");
        customerData.put("UserName", "aabbssss");
        customerData.put("Password", "aabbssss123");
        customerData.put("Email", "aabbsssss@gmail.com");
// Getting ArrayNode from JsonNodeFactory
        customerAddress = factory.arrayNode();
// Adding values to array
        customerAddress.add("14");
        customerAddress.add("Heron Mews");
        customerAddress.add("Ilford");
        customerAddress.add("IG1 4NW");
        customerData.set("address", customerAddress);

    }

    @Test
    public void postReqDemo1() throws JsonProcessingException {

        System.out.println("Json object with JsonNodeFactory : " + customerData);

        given()
                .baseUri("http://restapi.demoqa.com/customer")
                .basePath("/register")
                .contentType("application/json")
                .body(customerData)
        .when()
                .post()
        .then()
                .statusCode(200)
        .and()
                .body("SuccessCode", equalTo("OPERATION_SUCCESS"))
                .body("Message", equalTo("Operation completed successfully"))
                .log().all();
    }
}
