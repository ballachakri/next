$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/next/resources/features/ShouldBeAbleToLogInToAccount.feature");
formatter.feature({
  "name": "SHOULD BE ABLE TO LOGIN",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Should be able to login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "I click my Account",
  "keyword": "And "
});
formatter.step({
  "name": "I enter user name \"\u003cemailId\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I click on signIn",
  "keyword": "And "
});
formatter.step({
  "name": "I should be able view my account details",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emailId",
        "password"
      ]
    },
    {
      "cells": [
        "ballachakri@yahoo.com",
        "Khalifa123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Should be able to login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.i_am_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click my Account",
  "keyword": "And "
});
formatter.match({
  "location": "ShouldBeAbleToLoginSteps.i_click_my_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter user name \"ballachakri@yahoo.com\" and password \"Khalifa123\"",
  "keyword": "When "
});
formatter.match({
  "location": "ShouldBeAbleToLoginSteps.i_enter_user_name_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on signIn",
  "keyword": "And "
});
formatter.match({
  "location": "ShouldBeAbleToLoginSteps.i_click_on_signIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able view my account details",
  "keyword": "Then "
});
formatter.match({
  "location": "ShouldBeAbleToLoginSteps.i_should_be_able_view_my_account_details()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/java/com/next/resources/features/ShouldBeAbleToRegisterAccount.feature");
formatter.feature({
  "name": "SHOULD BE ABLE TO REGISTER",
  "description": "  As a end user\n  I want to register my account\n  so that I can get my a customer id",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.scenario({
  "name": "Should be able Register",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.i_am_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click my Account",
  "keyword": "And "
});
formatter.match({
  "location": "ShouldBeAbleToLoginSteps.i_click_my_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on register now",
  "keyword": "And "
});
formatter.match({
  "location": "ShouldBeAbleToRegisterAccountSteps.i_click_on_register_now()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter all the required below registration details",
  "rows": [
    {
      "cells": [
        "Title",
        "First Name",
        "Last Name",
        "Email",
        "Password",
        "DOB",
        "Telephone",
        "House Number",
        "Post Code"
      ]
    },
    {
      "cells": [
        "Mr",
        "John",
        "furgeh",
        "john@yahoo.com",
        "password1234",
        "15 07 93",
        "07854542111",
        "43",
        "IG2 2RJ"
      ]
    },
    {
      "cells": [
        "Mrs",
        "Neela",
        "Rao",
        "neela@gmail..com",
        "1243password",
        "11 11 79",
        "078545454",
        "101A",
        "E7 0QH"
      ]
    },
    {
      "cells": [
        "Miss",
        "Sheela",
        "Kumari",
        "nsheela@hotmail.com",
        "1242pass1234",
        "10 10 81",
        "07854542999",
        "37",
        "IG1 2SR"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "ShouldBeAbleToRegisterAccountSteps.i_enter_all_the_required_below_registration_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click register now",
  "keyword": "And "
});
formatter.match({
  "location": "ShouldBeAbleToRegisterAccountSteps.i_click_register_now()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be provided a customerNumber and selfServeNumber",
  "keyword": "Then "
});
formatter.match({
  "location": "ShouldBeAbleToRegisterAccountSteps.i_should_be_provided_a_customerNumber_and_selfServeNumber()"
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
  "keyword": "Feature",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Should be able to search a product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "I search for a product \"\u003cproduct\u003e\"",
  "keyword": "When "
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
    },
    {
      "cells": [
        "bags"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Should be able to search a product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.i_am_on_the_home_page()"
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
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.i_am_on_the_home_page()"
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
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.i_am_on_the_home_page()"
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
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.i_am_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for a product \"bags\"",
  "keyword": "When "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.i_search_for_a_product(String)"
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
  "description": "  As a end user\n  I search for a product\n  I will sort the product results\n  I should be able view all the products in selected sorting order",
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
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "I search for the an item \"shirt\"",
  "keyword": "When "
});
formatter.step({
  "name": "I select sort by \"\u003corder\u003e\"",
  "keyword": "And "
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
        "Price: Low - High"
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
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.i_am_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for the an item \"shirt\"",
  "keyword": "When "
});
formatter.match({
  "location": "ShouldBeAbleToSortProductSteps.i_search_for_the_an_item(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select sort by \"Most Relevant\"",
  "keyword": "And "
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
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductSteps.i_am_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for the an item \"shirt\"",
  "keyword": "When "
});
formatter.match({
  "location": "ShouldBeAbleToSortProductSteps.i_search_for_the_an_item(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select sort by \"Price: Low - High\"",
  "keyword": "And "
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
});