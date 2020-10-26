Feature: Account summary page
  Background:
    Given the user on the Account Summary page

  Scenario: Account summary page title
    Then the user should see Account summary page title as Zero-Account summary

  Scenario: Account summary page types
    Then the user should see following account types
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |
    And the user should see following columns in the Credit Accounts table
      | Account     |
      | Credit Card |
      | Balance     |