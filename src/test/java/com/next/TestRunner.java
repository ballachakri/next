package com.next;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
         tags ={""},
         plugin = {
        "html:src/test/java/cucumber_reports",
        "json:src/test/java/cucumber_reports/jsonfile.json"},
        features = {"src/test"})
public class TestRunner {

}
