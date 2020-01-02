@sort
Feature: SHOULD BE ABLE TO SORT PRODUCT
  As a end user
  I search for a product
  I will sort the product results
  I should be able view all the products in selected sorting order

  Scenario Outline: should be able to sort a product
    Given I am on the home page
    When I search for the an item "shirt"
    And I select sort by "<order>"
    Then I should view all products in a sorting order of "<order>"

    Examples:
      | order             |
      | Most Relevant     |
      | Price: Low - High |

