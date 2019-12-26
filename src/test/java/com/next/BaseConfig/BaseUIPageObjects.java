package com.next.BaseConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Base Page object class
 * Should be extended by all the page object classes
 */
public class BaseUIPageObjects {

    public static WebDriver driver;
    private DriverFactory driverFactory;

    /**
     * initializing the the Page Factory to identify the web elements
     */
    public BaseUIPageObjects() {

        PageFactory.initElements(driver, this);
    }

    /**
     * Setting up the test environment based upon the parameters passed.
     */
    public void setUpBrowser() {
        driverFactory =new DriverFactory();
        driver= driverFactory.getBrowserType();
        driver.get(driverFactory.getTestEnvironment());
        maximizeBrowser();
    }

    private void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    public void tearDown() {
        driver.quit();
    }

}
