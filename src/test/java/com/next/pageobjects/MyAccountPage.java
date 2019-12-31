package com.next.pageobjects;

import com.next.BaseConfig.BaseUIPageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * MyAccount page
 * Home page > Login page > My Account page
 */
public class MyAccountPage extends BaseUIPageObjects {
    @FindBy(css = "a[data-link-id='DataLinkId']")
    private WebElement accountName;

    public String getAccountName() {
        return accountName.getText();
    }
}
