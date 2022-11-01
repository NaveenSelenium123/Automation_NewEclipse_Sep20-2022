package org.test8;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FacebookExe8.Feature",
glue="org.step8",monochrome=true,dryRun=false,
plugin="json:src\\test\\resources\\Facebook\\fb.json",tags= {"@Sanity"})
public class TestRunner {

}
