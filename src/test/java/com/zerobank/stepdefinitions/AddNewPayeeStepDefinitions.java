package com.zerobank.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddNewPayeeStepDefinitions {
    @Given("Add New Payee tab")
    public void add_New_Payee_tab() {

    }

    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }

    @Then("message The new payee The Law Offices of Hyde, Price & Scharks was successfully created.should be displayed")
    public void message_The_new_payee_The_Law_Offices_of_Hyde_Price_Scharks_was_successfully_created_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions

    }

}
