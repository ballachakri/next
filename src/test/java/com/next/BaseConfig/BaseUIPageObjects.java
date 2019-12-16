package com.next.BaseConfig;

import cucumber.api.java.hu.De;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseUIPageObjects {

    public static WebDriver driver;


    //private String TEST_ENVIRONMENT=System.getProperty("test");
    private String TEST_ENVIRONMENT = "test";

    //test="https://www.next.co.uk/";

    private String PLATFORM = System.getProperty("platform");

    //private String BROWSER=System.getProperty("browser");
    private String BROWSER = "chrome";

    /**
     * initializing the the Page Factory
     */
    public BaseUIPageObjects() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Setting up the test environment based upon the parameters passed.
     */
    public void setHomePage() {

        switch (BROWSER) {

            case "chrome": {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                setEnvironment();
                maximizeBrowser();
                break;
            }
            case "ie": {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                setEnvironment();
                maximizeBrowser();
                break;
            }
            case "opera": {
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                setEnvironment();
                maximizeBrowser();
                break;
            }
            case "edge": {
                WebDriverManager.edgedriver().setup();
                EdgeOptions opt=new EdgeOptions();
                driver = new EdgeDriver();
                setEnvironment();
                maximizeBrowser();
                break;
            }
            default: {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                setEnvironment();
                maximizeBrowser();
                break;
            }

        }

    }

    private void setEnvironment() {

        if (TEST_ENVIRONMENT.equalsIgnoreCase("alpha")) {
            TEST_ENVIRONMENT = "https://www.nextalpha.co.uk/";
        } else {
            TEST_ENVIRONMENT = "https://www.next.co.uk/";
        }
        driver.get(TEST_ENVIRONMENT);
    }

    private void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    public void tearDown() {
        driver.quit();
    }

}
