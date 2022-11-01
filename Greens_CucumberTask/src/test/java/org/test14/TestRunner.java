package org.test14;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FacebookExe14.Feature",
glue="org.step14",dryRun=false,monochrome=true)
public class TestRunner {

}
