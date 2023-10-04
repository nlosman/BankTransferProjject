Feature: Account functionality

  Background:
    Given Navigate to url
    When Enter valid username and password
    Then LoginIn button click

  @Accounts @Regression
  Scenario: Accessing Account Details
    Given Show Account Overview
    Then User should be display Account Summary

    When User Clicks an Account number
    Then User should be display Account number, account type, balance, available balance

    When User displays the list of filtered account activities.
    Then This list should contain information.
    And  User clicks any processing on the list.
    Then User should be display the process details.
