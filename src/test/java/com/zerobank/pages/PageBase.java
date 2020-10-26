package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class PageBase {
    @FindBy(xpath = "//ul[@class='nav nav-tabs']/*")
    public List<WebElement> tabList;

    public PageBase() {
        PageFactory.initElements(Driver.getWebDriver(), this);
    }

    public void navigateToTab(String tabId){
        for(WebElement tab : tabList){
            if(tab.getAttribute("id").equals(tabId)){
                tab.click();
                break;
            }
        }
    }
}
