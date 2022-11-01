package org.test7;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\DemoQAExe7.Feature",glue="org.step7")
public class TestRunner {

}
