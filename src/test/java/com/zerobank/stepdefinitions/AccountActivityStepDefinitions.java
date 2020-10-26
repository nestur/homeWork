package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;

public class AccountActivityStepDefinitions {
    LoginStepDefinitions lsd = new LoginStepDefinitions();
    WebDriver driver = lsd.driver;
    AccountActivityPage activityPage;

    @Given("the user on the Account Activity page")
    public void the_user_on_the_Account_Activity_page() {
        lsd.login_with_valid_credentials();
        AccountSummaryPage summaryPage = new AccountSummaryPage();
        summaryPage.navigateToTab("account_activity_tab");
        activityPage = new AccountActivityPage();
    }

    @Then("the user should see Account activity page title as Zero-Account activity")
    public void the_user_should_see_Account_activity_page_title_as_Zero_Account_activity() {
        Assert.assertEquals(driver.getTitle(), "Zero - Account Activity");
    }

    @Then("the default option should be Savings")
    public void the_default_option_should_be_Savings() {
        Assert.assertEquals(activityPage.accountDropDown_Select.getFirstSelectedOption().getText(), "Savings");
    }

    @When("the user clicks the Account drop down")
    public void the_user_clicks_the_Account_drop_down() {
        activityPage.accountDropDown.click();
    }

    @Then("the user should see following Account drop down options")
    public void the_user_should_see_following_Account_drop_down_options(io.cucumber.datatable.DataTable dataTable) {
        Assert.assertEquals
                (
                        dataTable.toString().replace("|","").replaceAll("\\s+",""),
                        (activityPage.accountDropDown.getText().replaceAll("\\s+",""))
                );
    }

    @Then("the user should see following columns in the Transactions table")
    public void the_user_should_see_following_columns_in_the_Transactions_table(io.cucumber.datatable.DataTable dataTable) {

        Assert.assertEquals(dataTable.toString().replace("|",""),
                activityPage.transactionTable.replaceAll("\\s+",""));

    }
}
