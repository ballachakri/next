package com.next.BaseConfig;

import com.next.utils.Logs;
import com.next.utils.ScreenShot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.net.MalformedURLException;

/**
 * Hooks
 * Provides Before and After methods
 */
public class Hooks extends BaseUIPageObjects {

    @Before
    public void setupHomePage() throws MalformedURLException {
        Logs.startTestLog("TEST CASE NAME   ----    :    " + getClass().getName().toString().toUpperCase());
        System.out.println(String.format("CURRENT JVM THREAD ID - : '%s :' AND CURRENT THREAD NAME - : '%s :'  ", Thread.currentThread().getId(), Thread.currentThread().getName()));
        setUpBrowser();

    }

    @After
    public void closeBrowser(Scenario scenario) {
        if (scenario.isFailed()) {
            ScreenShot.getScreenShot(scenario.getName());
            ScreenShot.embedPhoto(scenario);
        }
        Logs.endTestLog(getClass().getName().toString());
        tearDown();
    }

}
