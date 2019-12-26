package com.next.BaseConfig;

import com.next.utils.Logs;
import com.next.utils.ScreenShot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.net.MalformedURLException;

public class Hooks extends BaseUIPageObjects {

    /**
     *
     */
    @Before
    public void setupHomePage() throws MalformedURLException {
        Logs.startTestLog("test case name       :    "+getClass().getName().toString());
        System.out.println("Current Running Thread ID  is    :    "+Thread.currentThread().getId());
        setUpBrowser();

    }

    @After
    public void closeBrowser(Scenario scenario) {
        if (scenario.isFailed()) {
            ScreenShot.getScreenShot(scenario.getName());
        }
        Logs.endTestLog(getClass().getName().toString());
        tearDown();
    }

}
