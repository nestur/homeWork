package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
    @FindBy(id="user_login")
    public WebElement loginInputBox;

    @FindBy(id="user_password")
    public WebElement passwordInputBox;

    @FindBy(id="user_remember_be")
    public WebElement keepMeSignedIn;

    @FindBy(name="submit")
    public WebElement signInButton;

    @FindBy(xpath = "//*[contains(text(), 'Login and/or password are wrong.')]")
    public WebElement loginErrorMessage;

    public void login(String username, String password) {
        loginInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        signInButton.click();
        // verification that we logged
    }
}
