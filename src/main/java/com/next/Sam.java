package com.next;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Sam {
    public static void main(String[] args) {

        OperaOptions opt=new OperaOptions();
        opt.setBinary("C:\\Users\\sball\\AppData\\Local\\Programs\\Opera\\launcher.exe");
        System.setProperty("webdriver.opera.driver","C:\\Users\\sball\\Downloads\\BrowserDrivers\\operadriver.exe");
        WebDriver driver=new OperaDriver(opt);
        driver.get("http://google.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

//        WebDriver driver=new HtmlUnitDriver(true);
//        driver.get("http://google.com");
//        driver.manage().window().maximize();
//        System.out.println(driver.getTitle());

    }
}
