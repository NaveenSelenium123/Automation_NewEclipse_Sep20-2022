package org.test15;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\DemoQAExe15.Feature",glue="org.step15",
dryRun=false,monochrome=true,tags= {"@Smoke"},plugin="json:src\\test\\resources\\Facebook\\demo1.json")
public class TestRunner {

}
