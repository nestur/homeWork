Feature: Navigating to specific accounts in Accounts Activity
  Background:
    Given the user is logged in

  Scenario Outline: Link redirect
    When the user clicks on <link> link on the Account Summary page
    Then the Account Activity page should be displayed
      And Account drop down should have <option> selected

    Scenarios:
      |link       |option     |
      |Savings    |Savings    |
      |Brokerage  |Brokerage  |
      |Checking   |Checking   |
      |Credit card|Credit card|
      |Loan       |Loan       |