package com.next.pagaobjects;

import com.next.BaseConfig.BaseUIPageObjects;
import com.next.utils.NamePattern;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

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

    private String product=null;

    public void enterSearchProduct(String item) {

        searchTextFiled.sendKeys(item);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public String getSearchResultsTitle() {
        return resultText.getText();
    }

    public void selectSortBy(String sortBy) {
        sortDropDown.click();
        sortDropDown.sendKeys(sortBy);
    }

    public List<String> getAllSortedNameList() {

        List<String> namesList=new ArrayList<String>();

        for(WebElement element: productNameList) {
            namesList.add(element.getText());
        }
        return namesList;
    }
    public List<Double> getAllSortedPriceList() {

        List<Double> priceList= new ArrayList<>();

        for(WebElement element: productPriceList) {
            String str=element.getText();
            String[] str1=str.replace("£","").split(" - ");
            priceList.add(Double.parseDouble(str1[0]));
        }
        return priceList;
    }


}
