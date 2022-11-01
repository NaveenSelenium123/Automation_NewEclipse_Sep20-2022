package org.test6;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\DemoQAExe6.Feature",glue="org.step6",
dryRun=false,monochrome=true,tags= {"@Smoke"},plugin="json:src\\test\\resources\\Facebook\\demo.json")
public class TestRunner {

}
