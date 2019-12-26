package com.next.utils;

import com.next.BaseConfig.BaseUIPageObjects;
import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenShot extends BaseUIPageObjects {


    public static void getScreenShot(String name)
    {
        TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
        File img=takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(img, new File("src/test/java/screenshot/"+name+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

