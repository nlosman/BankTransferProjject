Feature: Account functionality

  Scenario: Opening a new user account
    Given Navigate to url
    When fill out the registration form
    Then Click all
    And Verify successfully

    Scenario: User Login
      Given Navigate to url
      When Enter valid username and password
      Then LoginIn button click
      And Successfully verify  actualtext.

    Scenario: BillPay

      Given Navigate to url
      When Enter valid username and password
      Then LoginIn button click
      Then Redirect the user to the bill payment page
      And user can successfully pay 3 different bills
      And A success text should be available after each invoice.
      And The current balance should be seen after each payment.
