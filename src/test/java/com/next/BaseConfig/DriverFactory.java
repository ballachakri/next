package com.next.BaseConfig;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    private String browser = System.getProperty("browser");
    private String testEnvironment = System.getProperty("env");
    private String platform = System.getProperty("platform");
    private String type = System.getProperty("type");

//    private String browser = "chrome";
//    private String testEnvironment = "test";
//    private String platform = "local";
//    private String type="web";

    private final String url="http://192.168.56.1:4444/wd/hub";

    // This method set up and returns Browser Type and required Platform
    public WebDriver getBrowserType() {

        System.out.println(String.format("The Tests will be executing on : '%s' : BROWSER : '%s' : PLATFORM : '%s' : ENVIRONMENT", browser,platform,testEnvironment));

        switch (browser) {
            case "chrome": {
                if (platform.equalsIgnoreCase("local")) {
                    WebDriverManager.chromedriver().setup();
      //              ChromeOptions options=new ChromeOptions().setHeadless(true);
                      return new ChromeDriver();
                } else if (platform.equalsIgnoreCase("grid")) {
                    DesiredCapabilities cap = DesiredCapabilities.chrome();
                    cap.setPlatform(Platform.ANY);
                    try {
                        return new RemoteWebDriver(new URL(url), cap);
                    } catch (MalformedURLException e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    System.out.println("No Platform is selected, Running on default local machine.........!");
                    return new ChromeDriver();

                }
            }

            case "ie": {
                if (platform.equalsIgnoreCase("local")) {
                WebDriverManager.iedriver().setup();
                return new InternetExplorerDriver();
                } else if (platform.equalsIgnoreCase("grid")) {
                    DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
                    cap.setPlatform(Platform.ANY);
                    try {
                        return new RemoteWebDriver(new URL(url), cap);
                    } catch (MalformedURLException e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    System.out.println("No Platform is selected, Running on default local machine.........!");
                    return new InternetExplorerDriver();

                }
            }
            case "opera": {
                if (platform.equalsIgnoreCase("local")) {
                WebDriverManager.operadriver().setup();
                return new OperaDriver();
                } else if (platform.equalsIgnoreCase("grid")) {
                    DesiredCapabilities cap = DesiredCapabilities.opera();
                    cap.setPlatform(Platform.ANY);
                    try {
                        return new RemoteWebDriver(new URL(url), cap);
                    } catch (MalformedURLException e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    System.out.println("No Platform is selected, Running on default local machine.........!");
                    return new OperaDriver();

                }
            }
            case "edge": {
                if (platform.equalsIgnoreCase("local")) {
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
                } else if (platform.equalsIgnoreCase("grid")) {
                    DesiredCapabilities cap = DesiredCapabilities.edge();
                    cap.setPlatform(Platform.ANY);
                    try {
                        return new RemoteWebDriver(new URL(url), cap);
                    } catch (MalformedURLException e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    System.out.println("No Platform is selected, Running on default local machine.........!");
                    return new OperaDriver();

                }
            }
            case "htmlunit": {
                new HtmlUnitDriver(true);
                return new HtmlUnitDriver();
            }
            default: {
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            }
        }
    }

    // test or alpha or zeta
    public String getTestEnvironment() {

        if (testEnvironment.equalsIgnoreCase("test"))
            return "https://www.next.co.uk/";
        else if (testEnvironment.equalsIgnoreCase("alpha"))
            return "https://www.nextalpha.co.uk/";
        else
            return "https://www.nextzeta.co.uk/";

    }


    // webUI or API or mobile
    public void getTypeOfTest() {

        System.out.println(type);
    }
}
