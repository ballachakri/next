@search
Feature: SHOULD BE A ABLE TO SEARCH A PRODUCT

  As a end user
  I will search for a product
  then I should be able to view all the relevant products

  Scenario Outline: Should be able to search a product
    Given I am on the home page
    When I search for a product "<product>"
    And I click search button
    Then I should view all the relevant products

    Examples:
      | product |
      | shirt   |
      | shoe    |
      | jacket  |
      | bags    |
