package com.next.utils;

import com.next.BaseConfig.BaseUIPageObjects;
import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

/**
 * Util class to take the screenshots of failed scenarios
 */
public class ScreenShot extends BaseUIPageObjects {

    /**
     * This method takes screen shot of failed scenario and append the as image file.
     * @param name
     */
    public static void getScreenShot(String name) {
        TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
        File img=takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(img, new File("src/test/java/screenshot/"+name+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method takes screen shot and appends to the Cucumber report.
     * @param scenario
     */
        public static void embedPhoto(Scenario scenario){
            TakesScreenshot ts=(TakesScreenshot)driver;
            byte[] img= ts.getScreenshotAs(OutputType.BYTES);
            scenario.embed(img,"image/png");
        }
}



