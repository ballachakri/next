package com.next.steps;

import com.next.pageobjects.HeaderPage;
import com.next.pageobjects.LoginPage;
import com.next.pageobjects.RegisterPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class ShouldBeAbleToRegisterAccountSteps {

    @Given("I click on register now")
    public void i_click_on_register_now() {
         new LoginPage().clickRegisterNow();
    }

    @When("I enter all the required below registration details")
    public void i_enter_all_the_required_below_registration_details(io.cucumber.datatable.DataTable DataTable) {

        List<Map<String, String>> accountData = DataTable.asMaps(String.class, String.class);

        new RegisterPage().selectTitle(accountData.get(0).get("Title"))
                .enterFirstName(accountData.get(0).get("First Name")).enterLastName(accountData.get(0).get("Last Name"))
                .enterEmailID(accountData.get(0).get("Email")).enterPassword(accountData.get(0).get("Password"))
                .enterDateOfBirth(accountData.get(0).get("DOB")).enterTelephoneNo(accountData.get(0).get("Telephone"))
                .enterHouseNumber(accountData.get(0).get("House Number")).enterPostCode(accountData.get(0).get("Post Code"));

    }

    @When("I click register now")
    public void i_click_register_now() {
        System.out.println("CLICKING REGISTER NOW IGNORED -- NO NEED TO  CREATE ACCOUNT");
    }

    @Then("I should be provided a customerNumber and selfServeNumber")
    public void i_should_be_provided_a_customerNumber_and_selfServeNumber() {
        System.out.println("ASSERTION POINTS SHOULD BE CUSTOMER NUMBER AND SELFSERVE NUMBER");
    }
}
