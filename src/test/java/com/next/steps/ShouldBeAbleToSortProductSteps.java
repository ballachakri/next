package com.next.steps;

import com.next.pagaobjects.HomePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

public class ShouldBeAbleToSortProductSteps {

private HomePage homePage;

    @When("I select sort by {string}")
    public void i_select_sort_by(String sort)  {
       homePage=new HomePage();
       homePage.selectSortBy(sort);
    }

    @Then("I should view all products in a sorting order of {string}")
    public void i_should_view_all_products_in_a_sorting_order_of(String sortOrder) {

        if(sortOrder.equalsIgnoreCase("Most Relevant")) {
            for (String itemName : homePage.getAllSortedNameList()) {
                assertThat("Product are sorted incorrectly, please investigate",
                        itemName, containsString("Shirt"));
            }
        }


        if(sortOrder.equalsIgnoreCase("Price: Low - High")) {
        assertThat("Product by price has been not sorted correctly, please investigate",
                homePage.getAllSortedPriceList(), everyItem(is(both(greaterThanOrEqualTo(homePage.getAllSortedPriceList().get(0)))
                            .and(lessThanOrEqualTo(homePage.getAllSortedPriceList().get(23))))));
        }

        if(sortOrder.equalsIgnoreCase("Price: High - Low")) {
        assertThat("Product by price has been not sorted correctly, please investigate",
                homePage.getAllSortedPriceList(), everyItem(is(both(lessThanOrEqualTo(homePage.getAllSortedPriceList().get(23)))
                        .and(greaterThanOrEqualTo(homePage.getAllSortedPriceList().get(0))))));
        }
    }


   }

