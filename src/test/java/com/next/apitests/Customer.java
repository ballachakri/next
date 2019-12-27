package com.next.apitests;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Model class to parse response JSON
 */
//
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "firstName",
        "lastName",
        "userName",
        "password",
        "email"
})

public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("FirstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    @JsonProperty("LastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("LastName")
    public void setLastName(String lname) {
        this.lastName = lname;
    }

    @JsonProperty("UserName")
    public String getUserName() {
        return userName;
    }

    @JsonProperty("UserName")
    public void setUserName(String uname) {
        this.userName = uname;
    }

    @JsonProperty("Password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("Password")
    public void setPassword(String pwd) {
        this.password = pwd;
    }

    @JsonProperty("Email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("Email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
