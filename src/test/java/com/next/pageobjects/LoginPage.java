package com.next.pageobjects;

import com.next.BaseConfig.BaseUIPageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Page Object
 * Home Page > Account > login page
 */
public class LoginPage extends BaseUIPageObjects {

    @FindBy(css = "input[id='EmailOrAccountNumber']")
    private WebElement emailIdTextField;

    @FindBy(css = "input[id='Password']")
    private WebElement passwordTextField;

    @FindBy(css = "#passwordLogin > div:nth-child(2) > div > div > span")
    private WebElement rememberMeCheckbox;

    @FindBy(css = "input[id='SignInNow']")
    private WebElement signInButton;

    @FindBy(css = "a[data-ga-guest-label='Sign-up-now']")
    private WebElement registerNowButton;

    public LoginPage enterEmailID(final String emailID) {
        emailIdTextField.clear();
        emailIdTextField.sendKeys(emailID);
        return this;
    }

    public LoginPage enterPassword(final String password) {
        passwordTextField.clear();
        passwordTextField.sendKeys(password);
        return this;
    }

    public LoginPage clickRememberCheckbox() {
        rememberMeCheckbox.click();
        return this;

    }

    public LoginPage clickSignIn() {
        signInButton.click();
        return this;
    }

    public LoginPage clickRegisterNow() {
        registerNowButton.click();
        return this;
    }
}
