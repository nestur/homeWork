package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends PageBase {
    @FindBy(id="signin_button")
    public WebElement signin;
}
