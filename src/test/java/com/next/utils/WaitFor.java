package com.next.utils;

import com.next.BaseConfig.BaseUIPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor extends BaseUIPageObjects {

public static void clickable(WebElement element) {
    WebDriverWait wait=new WebDriverWait(driver, 3000);
    wait.until(ExpectedConditions.elementToBeClickable(element));
}
}
