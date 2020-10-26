@Login
Feature: Login page
  Background:
    Given the user is on the login page

  Scenario: Login with invalid credentials
    When the user enters with wrong username or wrong password
    Then the user should not be able to login
    Then the user should see error message Login and/or password wrong

  Scenario: Login with missing credentials
    When the user enters with blank username or password
    Then the user should not be able to login
    Then the user should see error message Login and/or password wrong

  Scenario: Login with valid credentials
    When the user enters with valid credentials
    Then the user should see Account Summary page