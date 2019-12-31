package com.next.pageobjects;

import com.next.BaseConfig.BaseUIPageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Page Objects
 * Home Page - Header
 */
public class HeaderPage extends BaseUIPageObjects {

    @FindBy(css = "input[name='w']")
    private WebElement searchTextFiled;

    @FindBy(css = "input[class='SearchButton']")
    private WebElement searchButton;

    @FindBy(css = "div[id='dk_container_iSort']")
    private WebElement sortDropDown;

    @FindBy(css = "a[title*='Sign']")
    private WebElement myAccountLink;

    public HeaderPage enterSearchProduct(final String item) {
        searchTextFiled.clear();
        searchTextFiled.sendKeys(item);
        return this;
    }

    public HeaderPage clickSearchButton() {
        searchButton.click();
        return this;
    }

    public HeaderPage selectSortBy(String sortBy) {
        new Actions(driver).click(sortDropDown).build().perform();
        sortDropDown.sendKeys(sortBy);
        return this;
    }

    public HeaderPage clickMyAccountLink() {
        myAccountLink.click();
        return this;
    }
}
