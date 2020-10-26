package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends PageBase {
    @FindBy(css="table.table.table-condensed.table-hover")
    public WebElement transactionTable;

    @FindBy(css="#aa_accountId")
    public WebElement accountDropDown; //TODO: Change Select to WebElement
    public Select accountDropDown_Select;

    public AccountActivityPage(){
        accountDropDown_Select = new Select(accountDropDown);

    }
}

