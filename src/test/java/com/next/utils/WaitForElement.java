package com.next.utils;

import com.next.BaseConfig.BaseUIPageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElement extends BaseUIPageObjects {

public static void clickable(WebElement element) {
    WebDriverWait wait=new WebDriverWait(driver, 3000);
    wait.until(ExpectedConditions.elementToBeClickable(element));
}
public static void visible(WebElement element) {
    WebDriverWait wait=new WebDriverWait(driver,300);
    wait.until(ExpectedConditions.visibilityOf(element));
}
//public static void waitFluentToClickable(WebElement element) {
//    Wait<WebDriver> fluentWait = new FluentWait<>(driver)
//            .ignoring(StaleElementReferenceException.class)
//            .pollingEvery(500, TimeUnit.MILLISECONDS)
//            .withTimeout(5000, TimeUnit.MILLISECONDS)
//            .withMessage("Element not found");
//
//}
}
