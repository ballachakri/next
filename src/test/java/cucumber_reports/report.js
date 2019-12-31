$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/next/resources/features/ShouldBeAbleToRegisterAccount.feature");
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
        "151279",
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
        "11111979",
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
        "1010581",
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
});