Feature: SAMPLE DATABASE TEST

  Scenario: database test
    Given I am connected to database
    When I search for countries in a continent as "Asia"
    Then I should view all the countries in the continent
