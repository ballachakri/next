package com.next.pagaobjects;

import com.next.BaseConfig.BaseUIPageObjects;
import com.next.utils.NamePattern;
import com.next.utils.WaitFor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class HomePage extends BaseUIPageObjects {

    @FindBy(css = "input[name='w']")
    private WebElement searchTextFiled;

    @FindBy(css = "input[class='SearchButton']")
    private WebElement searchButton;

    @FindBy(css = "div[id='rhs'] h1 > div")
    private WebElement resultText;

    @FindBy(css = "div[id='dk_container_iSort']")
    private WebElement sortDropDown;

    @FindBy(css = "article[class*='Item  Fashion'] div[class='Info'] span")
    private List<WebElement> productNameList;

    @FindBy(css = "article[class*='Item  Fashion'] div[class='Price'] ")
    private List<WebElement> productPriceList;


    public void enterSearchProduct(final String item) {
        System.out.println("HOME PAGE : ITEM SEARCHED    :  "+item );
        searchTextFiled.sendKeys(item);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public String getSearchResultsTitle() {
        return resultText.getText();
    }

    public void selectSortBy(String sortBy) {
        new Actions(driver).click(sortDropDown).build().perform();
        //sortDropDown.click();
        sortDropDown.sendKeys(sortBy);
    }

    public List<String> getAllSortedNameList() {

        List<String> namesList = new ArrayList<String>();

        for (WebElement element : productNameList) {
            namesList.add(element.getText());
        }
        return namesList;
    }

    public Set<Double> getAllSortedPriceList() {

        Set<Double> priceList = new HashSet<>();

        for (WebElement element : productPriceList) {
            String str = element.getText();
            String[] str1 = str.replace("£", "").split(" - ");
            priceList.add(Double.parseDouble(str1[0]));
        }
        return priceList;
    }
}
