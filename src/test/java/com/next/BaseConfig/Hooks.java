package com.next.BaseConfig;

import com.next.utils.Logs;
import com.next.utils.ScreenShot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseUIPageObjects {

    /**
     *
     */
    @Before
    public void setupBrowser() {
        Logs.startTestLog(getClass().getName().toString());
        setHomePage();
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
