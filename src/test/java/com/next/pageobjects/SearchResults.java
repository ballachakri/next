package com.next.pageobjects;

import com.next.BaseConfig.BaseUIPageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Page Object
 * Home Page > Search page
 */

public class SearchResults extends BaseUIPageObjects {

    @FindBy(css = "div[id='rhs'] h1 > div")
    private WebElement resultText;

    @FindBy(css = "article[class*='Item  Fashion'] div[class='Info'] span")
    private List<WebElement> productNameList;

    @FindBy(css = "article[class*='Item  Fashion'] div[class='Price'] ")
    private List<WebElement> productPriceList;

    public String getSearchResultsTitle() {
        return resultText.getText();
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
