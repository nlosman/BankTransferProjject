Feature: Bill Pay

  Scenario: Bill Pay
    Given Navigate to Parabank
    When Enter username and password
    Then Click Login button
    And Click Bill Pay
    Then Success message should be displayed Bill Payment Service
    And Fill in the blanks
    When Click pay button
#    Then Success message should be displayed amount and account
    When Click accounts overview button
    And Click account number
#    Then User should see date, name of bill, amount





