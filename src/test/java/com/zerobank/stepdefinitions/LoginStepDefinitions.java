package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.pages.WelcomePage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinitions {
    WebDriver driver = Driver.getWebDriver();
    LoginPage loginPage;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        driver.get(url);
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.signin.click();
    }

    @When("the user enters with valid credentials")
    public void the_user_enters_with_valid_credentials() {
        loginPage=new LoginPage();
        loginPage.login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
    }

    @Then("the user should see Account Summary page")
    public void the_user_should_see_Account_Summary_page() {
        Assert.assertEquals("Zero - Account Summary", driver.getTitle());
    }

    @When("the user enters with wrong username or wrong password")
    public void the_user_enters_with_wrong_username_or_wrong_password() {
        loginPage=new LoginPage();
        loginPage.login(ConfigurationReader.get("username"),"passwordd");
    }

    @Then("the user should not be able to login")
    public void the_user_should_not_be_able_to_login() {
        Assert.assertTrue(driver.getCurrentUrl().contains("login_error=true"));
    }

    @Then("the user should see error message Login and\\/or password wrong")
    public void the_user_should_see_error_message_Login_and_or_password_wrong() {
        loginPage=new LoginPage();
        Assert.assertTrue(loginPage.loginErrorMessage.isDisplayed());
    }

    @When("the user enters with blank username or password")
    public void the_user_enters_with_blank_username_or_password() {
        loginPage=new LoginPage();
        loginPage.login(ConfigurationReader.get("username"),"");
    }

    public void login_with_valid_credentials(){
        the_user_is_on_the_login_page();
        the_user_enters_with_valid_credentials();
    }
}