$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/next/dbfeatures/TestDb.feature");
formatter.feature({
  "name": "SAMPLE DATABASE TEST",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "database test",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am connected to database",
  "keyword": "Given "
});
formatter.match({
  "location": "DBCountriesSteps.i_am_connected_to_database()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for countries in a continent as \"Asia\"",
  "keyword": "When "
});
formatter.match({
  "location": "DBCountriesSteps.i_search_for_countries_in_a_continent_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should view all the countries in the continent",
  "keyword": "Then "
});
formatter.match({
  "location": "DBCountriesSteps.i_should_view_all_the_countries_in_the_continent()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/java/com/next/resources/features/ShouldBeAbleToSearchProduct.feature");
formatter.feature({
  "name": "SHOULD BE A ABLE TO SEARCH A PRODUCT",
  "description": "  As a end user\n  I will search for a product\n  then I should be able to view all the relevant products",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Should be able to search a product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "As a user i am on the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "I search for a product \"\u003cproduct\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I click search button",
  "keyword": "And "
});
formatter.step({
  "name": "I should view all the relevant products",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "shirt"
      ]
    },
    {
      "cells": [
        "shoe"
      ]
    },
    {
      "cells": [
        "jacket"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Should be able to search a product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As a user i am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.as_a_user_i_am_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for a product \"shirt\"",
  "keyword": "When "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.i_search_for_a_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click search button",
  "keyword": "And "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.iClickSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should view all the relevant products",
  "keyword": "Then "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.i_should_view_all_the_relevant_products()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Should be able to search a product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As a user i am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.as_a_user_i_am_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for a product \"shoe\"",
  "keyword": "When "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.i_search_for_a_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click search button",
  "keyword": "And "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.iClickSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should view all the relevant products",
  "keyword": "Then "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.i_should_view_all_the_relevant_products()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Should be able to search a product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As a user i am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.as_a_user_i_am_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for a product \"jacket\"",
  "keyword": "When "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.i_search_for_a_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click search button",
  "keyword": "And "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.iClickSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should view all the relevant products",
  "keyword": "Then "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.i_should_view_all_the_relevant_products()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/java/com/next/resources/features/ShouldBeAbleToSortProduct.feature");
formatter.feature({
  "name": "SHOULD BE ABLE TO SORT PRODUCT",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sort"
    }
  ]
});
formatter.scenarioOutline({
  "name": "should be able to sort a product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "As a user i am on the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "I search for a product \"shirt\"",
  "keyword": "And "
});
formatter.step({
  "name": "I click search button",
  "keyword": "And "
});
formatter.step({
  "name": "I select sort by \"\u003corder\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I should view all products in a sorting order of \"\u003corder\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "order"
      ]
    },
    {
      "cells": [
        "Most Relevant"
      ]
    },
    {
      "cells": [
        "Most Popular"
      ]
    },
    {
      "cells": [
        "Alphabetical"
      ]
    },
    {
      "cells": [
        "Price: Low - High"
      ]
    },
    {
      "cells": [
        "Price: High - Low"
      ]
    }
  ]
});
formatter.scenario({
  "name": "should be able to sort a product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sort"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As a user i am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.as_a_user_i_am_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for a product \"shirt\"",
  "keyword": "And "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.i_search_for_a_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click search button",
  "keyword": "And "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.iClickSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select sort by \"Most Relevant\"",
  "keyword": "When "
});
formatter.match({
  "location": "ShouldBeAbleToSortProductSteps.i_select_sort_by(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should view all products in a sorting order of \"Most Relevant\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ShouldBeAbleToSortProductSteps.i_should_view_all_products_in_a_sorting_order_of(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "should be able to sort a product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sort"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As a user i am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.as_a_user_i_am_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for a product \"shirt\"",
  "keyword": "And "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.i_search_for_a_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click search button",
  "keyword": "And "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.iClickSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select sort by \"Most Popular\"",
  "keyword": "When "
});
formatter.match({
  "location": "ShouldBeAbleToSortProductSteps.i_select_sort_by(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should view all products in a sorting order of \"Most Popular\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ShouldBeAbleToSortProductSteps.i_should_view_all_products_in_a_sorting_order_of(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "should be able to sort a product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sort"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As a user i am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.as_a_user_i_am_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for a product \"shirt\"",
  "keyword": "And "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.i_search_for_a_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click search button",
  "keyword": "And "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.iClickSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select sort by \"Alphabetical\"",
  "keyword": "When "
});
formatter.match({
  "location": "ShouldBeAbleToSortProductSteps.i_select_sort_by(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should view all products in a sorting order of \"Alphabetical\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ShouldBeAbleToSortProductSteps.i_should_view_all_products_in_a_sorting_order_of(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "should be able to sort a product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sort"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As a user i am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.as_a_user_i_am_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for a product \"shirt\"",
  "keyword": "And "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.i_search_for_a_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click search button",
  "keyword": "And "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.iClickSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select sort by \"Price: Low - High\"",
  "keyword": "When "
});
formatter.match({
  "location": "ShouldBeAbleToSortProductSteps.i_select_sort_by(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should view all products in a sorting order of \"Price: Low - High\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ShouldBeAbleToSortProductSteps.i_should_view_all_products_in_a_sorting_order_of(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "should be able to sort a product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sort"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As a user i am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.as_a_user_i_am_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for a product \"shirt\"",
  "keyword": "And "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.i_search_for_a_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click search button",
  "keyword": "And "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.iClickSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select sort by \"Price: High - Low\"",
  "keyword": "When "
});
formatter.match({
  "location": "ShouldBeAbleToSortProductSteps.i_select_sort_by(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should view all products in a sorting order of \"Price: High - Low\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ShouldBeAbleToSortProductSteps.i_should_view_all_products_in_a_sorting_order_of(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});