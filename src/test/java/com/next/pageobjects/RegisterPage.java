package com.next.pageobjects;

import com.next.BaseConfig.BaseUIPageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Register Page object
 * Home > Login > Register
 */
public class RegisterPage extends BaseUIPageObjects {

    @FindBy(css = "select[data-ga='TitleDropDown']")
    private WebElement titleDropDown;

    @FindBy(css = "input[id='FirstName']")
    private WebElement firstNameTextField;

    @FindBy(css = "input[id='LastName']")
    private WebElement lastNameTextField;

    @FindBy(css = "input[id='Email']")
    private WebElement emailIdTextField;

    @FindBy(css = "input[id='Password']")
    private WebElement passwordTextField;

    @FindBy(css = "input[id='DobDate']")
    private WebElement dateOfBirthTextField;

    @FindBy(css = "input[id='PhoneNumber']")
    private WebElement telephoneNumberTextField;

    @FindBy(css = "input[id='HouseNumberOrName']")
    private WebElement houseNumberTextField;

    @FindBy(css = "input[id='Postcode']")
    private WebElement postCodeTextField;

    @FindBy(css = "input[id='RequestDirNo']")
    private WebElement noDirectoryButton;

    @FindBy(css = "button[id='SignupButton']")
    private WebElement registerMyAccountButton;

    public RegisterPage selectTitle(final String title) {
        new Select(titleDropDown).selectByVisibleText(title);
        return this;
    }

    public RegisterPage enterFirstName(final String firstName) {
        firstNameTextField.clear();
        firstNameTextField.sendKeys(firstName);
        return this;
    }

    public RegisterPage enterLastName(final String lastName) {
        lastNameTextField.clear();
        lastNameTextField.sendKeys(lastName);
        return this;
    }

    public RegisterPage enterEmailID(final String eMail) {
        emailIdTextField.clear();
        emailIdTextField.sendKeys(eMail);
        return this;
    }

    public RegisterPage enterPassword(final String password) {
        passwordTextField.clear();
        passwordTextField.sendKeys(password);
        return this;
    }

    public RegisterPage enterDateOfBirth(final String dob) {
        dateOfBirthTextField.clear();
        dateOfBirthTextField.sendKeys(dob);
        return this;
    }

    public RegisterPage enterTelephoneNo(final String telephoneNo) {
        telephoneNumberTextField.clear();
        telephoneNumberTextField.sendKeys(telephoneNo);
        return this;
    }

    public RegisterPage enterHouseNumber(final String houseNo) {
        houseNumberTextField.clear();
        houseNumberTextField.sendKeys(houseNo);
        return this;
    }

    public RegisterPage enterPostCode(final String postCode) {
        postCodeTextField.clear();
        postCodeTextField.sendKeys(postCode);
        return this;
    }

    public RegisterPage clickNoDirectoryButton() {
        noDirectoryButton.click();
        return this;
    }

    public RegisterPage clickRegisterNow() {
        registerMyAccountButton.click();
        return this;
    }

}
