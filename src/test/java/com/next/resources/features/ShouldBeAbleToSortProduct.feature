@sort
Feature: SHOULD BE ABLE TO SORT PRODUCT

  Scenario Outline: should be able to sort a product
    Given I am on the home page
    And I search for the an item "shirt"
    And I click search button
    When I select sort by "<order>"
    Then I should view all products in a sorting order of "<order>"

    Examples:
    |order|
    |Most Relevant|
    |Price: Low - High|
