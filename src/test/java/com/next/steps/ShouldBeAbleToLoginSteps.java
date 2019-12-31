package com.next.steps;

import com.next.pageobjects.HeaderPage;
import com.next.pageobjects.HomePage;
import com.next.pageobjects.LoginPage;
import com.next.pageobjects.MyAccountPage;
import com.next.utils.Logs;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class ShouldBeAbleToLoginSteps {

    private LoginPage loginPage;

    @Given("I click my Account")
    public void i_click_my_Account() {
        Logs.info("THE TEST STEPS OF STEP DEFINITIONS CLASS :  " + this.getClass().getName() + " ARE BEING EXECUTING......................!");
        new HeaderPage().clickMyAccountLink();
    }

    @When("I enter user name {string} and password {string}")
    public void i_enter_user_name_and_password(String emailID, String password) {
        loginPage = new LoginPage().enterEmailID(emailID).clickRememberCheckbox().enterPassword(password);

    }

    @When("I click on signIn")
    public void i_click_on_signIn() {
        loginPage.clickSignIn();
    }

    @Then("I should be able view my account details")
    public void i_should_be_able_view_my_account_details() {
        assertThat("User is unable to login to his account, please investigate",
                new MyAccountPage().getAccountName(), equalToIgnoringCase("chakra"));
    }

}
