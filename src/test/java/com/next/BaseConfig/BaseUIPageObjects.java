package com.next.BaseConfig;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Base Page object class
 * Should be extended by all the page object classes
 */
public class BaseUIPageObjects{

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
        driver = driverFactory.getBrowserType();
        System.out.println("WEB-DRIVER NAME     :    "+driver);
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
