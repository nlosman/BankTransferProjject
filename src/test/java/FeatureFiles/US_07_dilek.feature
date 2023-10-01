Feature: Testing user information


  Scenario: Entering customer information
    Given Navigate to bank
    When Enter username and password
    Then Click login button
    Then User should login successfully
    Given Click contactinfo
    Then Enter firstname and  lastname
    Then Enter address and city
    Then Enter state and zipcode and
    Then Click update profile

  Scenario: Update contact information
    Given Navigate to bank
    When Enter username and password
    Then Click login button
    Then User should login successfully
    Given Click contactinfo
    When Changing to state and city and zipcode
    Then Click update profile
    Then Display confirmation message
    Then Click logout button
    Then Click  login again




