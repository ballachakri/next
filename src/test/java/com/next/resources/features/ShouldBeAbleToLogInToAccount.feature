@login
Feature: SHOULD BE ABLE TO LOGIN

  Scenario Outline: Should be able to login
    Given I am on the home page
    And I click my Account
    When I enter user name "<emailId>" and password "<password>"
    And I click on signIn
    Then I should be able view my account details

    Examples:
      | emailId               | password   |
      | ballachakri@yahoo.com | Khalifa123 |