$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "the user enters with wrong username or wrong password",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.the_user_enters_with_wrong_username_or_wrong_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should not be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.the_user_should_not_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see error message Login and/or password wrong",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.the_user_should_see_error_message_Login_and_or_password_wrong()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with missing credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "the user enters with blank username or password",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.the_user_enters_with_blank_username_or_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should not be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.the_user_should_not_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see error message Login and/or password wrong",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.the_user_should_see_error_message_Login_and_or_password_wrong()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "the user enters with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.the_user_enters_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see Account Summary page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.the_user_should_see_Account_Summary_page()"
});
formatter.result({
  "status": "passed"
});
});