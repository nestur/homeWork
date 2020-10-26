Feature: Pay Bills
  Background:
    Given the user on the Pay Bills page

  Scenario: Pay Bills page title
    Then the user should see Pay Bills page title as Zero-Pay Bills

  Scenario: Payment successful
    When the user completes a successful pay operation
    Then user should see the message The payment was successfully submitted

  Scenario: Payment with missing data
    When the user tries to make a payment without entering the amount or date
    Then user should see the message Please fill out this field!

  Scenario: Amount field
    When the user tries to enter non-numeric characters into the amount field
    Then the field should not accept non-numeric characters

  Scenario: Date field
    When the user tries to enter non-numeric characters into the date field
    Then the field should not accept non-numeric characters
