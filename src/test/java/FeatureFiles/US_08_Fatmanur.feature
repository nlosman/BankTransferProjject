Feature: Credit Application Multi Scenario

  Background:

   # calistigimiz site bazen register istiyor,

    Given Navigate to Parabank
   # When Click Register button
   # Then fill out the registration form
   # And Click all

     # bazende sadece username ve password istiyor

    When Enter username and password
    Then Click Login button
    Then Click Request Loan link

  Scenario: Credit Application

    When Enter Loan Amount and Down Payment
    Then Select account number
    And Click Apply Now button

    When Confirm Credit Request Processed information
    Then Success message should be displayed

    And Click new account number
    When Confirm Account Details information
    Then Confirm Account Activity message

  Scenario: Credit Application Negative

    When Enter Loan Amount and Down Payment (scenario two)
    Then Select account number
    And Click Apply Now button


    When Confirm Credit Request Processed information
    Then Confirm the message (scenario two)