Feature: Account Activity page
  Background:
    Given the user on the Account Activity page

  Scenario: Account activity page title
    Then the user should see Account activity page title as Zero-Account activity

  Scenario: Account drop down default option
    Then the default option should be Savings

  Scenario: Account drop down options
    When the user clicks the Account drop down
    Then the user should see following Account drop down options
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |

  Scenario: Transactions table
    Then the user should see following columns in the Transactions table
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |