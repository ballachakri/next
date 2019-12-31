package com.next.apitests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;

/**
 * API POST request
 * ObjectMapper require POJO class
 */
public class PostReqObjectMapper {

    Customer customer;
    ObjectMapper mapper;
    Map<String ,String> customerData;

    @Before
    public void createJsonData() throws IOException {
        customer=new Customer();
        mapper=new ObjectMapper();
        customerData=new HashMap<>();

        customer.setFirstName("chakra");
        customer.setLastName("balla");
        customer.setUserName("chakraballa");
        customer.setPassword("chakra1234");
        customer.setEmail("chakra@gmail.com");

        customerData.put("FirstName",customer.getFirstName());
        customerData.put("LastName",customer.getLastName());
        customerData.put("UserName",customer.getUserName());
        customerData.put("Password",customer.getPassword());
        customerData.put("Email",customer.getEmail());
        //mapper.writeValue(System.out,customerData);
    }
@Test
public void postReqDemo3() throws IOException {

    // out will be just as map key=value not json object
    System.out.println("just customer data  :"+customerData);

//    mapper.writeValue(System.out,customerData);
// to convert into json object we use mapper.writeValueAsString
    String str1=mapper.writeValueAsString(customerData);
    System.out.println("String after mapper.writeValueAsString :  "+str1);

// to convert into json object we use mapper.writeValueAsString
    // to get pretty format
    String str2=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(customerData);
    System.out.println("String after mapper.writeWithDefaultPrettyPrinter   : "+str2);
    given()
            .baseUri("http://restapi.demoqa.com/customer")
            .basePath("/register")
            .contentType("application/json")
            .body(str2)
    .when()
   //         .post()
    .then()
            .statusCode(200)
            .statusLine("HTTP/1.1 200 OK")
    .and()
            .body("SuccessCode", equalTo("OPERATION_SUCCESS"))
            .body("Message", equalTo("Operation completed successfully"))
            .log().all();
    }

}
