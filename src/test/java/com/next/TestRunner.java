package com.next;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
         tags ={"not @dbcountry"},
         plugin = {
        "html:src/test/java/cucumber_reports",
        "json:src/test/java/cucumber_reports/jsonfile.json",
        "rerun:sec/test/java/screenshot/failedTest.txt" },
        features = {"src/test"})
public class TestRunner {
 
}
