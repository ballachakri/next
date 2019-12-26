package com.next.steps;

import com.next.pagaobjects.HomePage;

import com.next.testDataShare.ShareState;
import com.next.utils.Logs;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;

public class ShouldBeAbleToSearchProductSteps {

    private HomePage homePage;
    private ShareState shareState;

    public ShouldBeAbleToSearchProductSteps(ShareState shareState) {
        this.shareState = shareState;
    }
    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        Logs.info(">>>>>>>>>>>>>>>> : " +this.getClass().getName() +" : STEPS ARE BEING EXECUTING.........................!");
        homePage = new HomePage();
   }

    @When("I search for a product {string}")
    public void i_search_for_a_product(final String item) {
       //myData= new MyData();
       shareState.setData(item);
       homePage.enterSearchProduct(item);
    }

    @And("I click search button")
    public void iClickSearchButton() {
        homePage.clickSearchButton();
    }

    @Then("I should view all the relevant products")
    public void i_should_view_all_the_relevant_products() {
        assertThat("Product results are incorrect, please investigate",
                homePage.getSearchResultsTitle(), equalToIgnoringCase(shareState.getData()));
    }
}
