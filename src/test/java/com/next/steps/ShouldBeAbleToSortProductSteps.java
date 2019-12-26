package com.next.steps;

import com.next.pagaobjects.HomePage;

import com.next.testDataShare.ShareState;
import com.next.utils.Logs;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

public class ShouldBeAbleToSortProductSteps {

private HomePage homePage;
private ShareState shareState;

public ShouldBeAbleToSortProductSteps(ShareState shareState){
    this.shareState=shareState;
}
    @Given("I search for the an item {string}")
    public void i_search_for_the_an_item(String item) {
     Logs.info(">>>>>>> " +this.getClass().getName() +" STEPS ARE BEING EXECUTING.........................!");
     homePage=new HomePage();
     shareState.setData(item);
     homePage.enterSearchProduct(item);
    }

    @When("I select sort by {string}")
    public void i_select_sort_by(final String sort)  {
       homePage.selectSortBy(sort);
    }

    @Then("I should view all products in a sorting order of {string}")
    public void i_should_view_all_products_in_a_sorting_order_of(String sortOrder) {

        if(sortOrder.equalsIgnoreCase("Most Relevant")) {
            for (String itemName : homePage.getAllSortedNameList()) {
                assertThat("Product are sorted incorrectly, please investigate",
                        itemName, containsStringIgnoringCase(shareState.getData()));
            }
        }

        if(sortOrder.equalsIgnoreCase("Price: Low - High")) {
            System.out.println("ALL PRICE LIST : "+homePage.getAllSortedPriceList());
            System.out.println("MIN PRICE IN LIST : "+ Collections.min(homePage.getAllSortedPriceList()));
            System.out.println("MAX PRICE IN LIST : "+ Collections.max(homePage.getAllSortedPriceList()));

        assertThat("Product by price has been not sorted correctly, please investigate",
                homePage.getAllSortedPriceList(), everyItem(is(both(greaterThanOrEqualTo(Collections.min(homePage.getAllSortedPriceList())))
                            .and(lessThanOrEqualTo(Collections.max(homePage.getAllSortedPriceList()))))));
        }

    }


   }

