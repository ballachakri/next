package com.next.utils;

import com.next.BaseConfig.BaseUIPageObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class GoToElement extends BaseUIPageObjects {

    public static void goToElement(WebElement element)
    {
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)",element);
    }
}
