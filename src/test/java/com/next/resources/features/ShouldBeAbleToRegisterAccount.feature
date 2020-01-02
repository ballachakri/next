@register
Feature: SHOULD BE ABLE TO REGISTER
  As a end user
  I want to register my account
  so that I can get my a customer id

  Scenario: Should be able Register
    Given I am on the home page
    And I click my Account
    And I click on register now
    When I enter all the required below registration details
      | Title | First Name | Last Name | Email               | Password     | DOB    | Telephone   | House Number | Post Code |
      | Mr    | John       | furgeh    | john@yahoo.com      | password1234 | 15 07 93 | 07854542111 | 43           | IG2 2RJ   |
      | Mrs   | Neela      | Rao       | neela@gmail..com    | 1243password | 11 11 79 | 078545454   | 101A         | E7 0QH    |
      | Miss  | Sheela     | Kumari    | nsheela@hotmail.com | 1242pass1234 | 10 10 81 | 07854542999 | 37           | IG1 2SR   |
    And I click register now
    Then I should be provided a customerNumber and selfServeNumber

