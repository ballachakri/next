@dbcountry

Feature: SAMPLE DATABASE TEST

  Scenario: Should be able to search for all counties in continent
    Given I am connected to database
    When I search for countries in a continent as "Asia"
    Then I should view all the countries in the continent
