package com.next;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags ={"@register"},
        features = {"src/test"},
  //      glue = {"src/test/java/com/next/steps"},
        plugin =  {
        "html:src/test/java/cucumber_reports",
        "json:src/test/java/cucumber_reports/jsonfile.json",
        "rerun:src/test/java/screenshot/failedTest.txt" }
       )
public class TestRunner {

}
