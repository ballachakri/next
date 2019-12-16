@sort
Feature: SHOULD BE ABLE TO SORT PRODUCT

  Scenario Outline: should be able to sort a product
    Given As a user i am on the home page
    And I search for a product "shirt"
    And I click search button
    When I select sort by "<order>"
    Then I should view all products in a sorting order of "<order>"

    Examples:
    |order|
    |Most Relevant|
    |Most Popular|
    |Alphabetical|
    |Price: Low - High|
    |Price: High - Low|