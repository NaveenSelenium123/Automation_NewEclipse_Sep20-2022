package com.lao.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources",
		glue="com.lao.stepdef",
		dryRun=false,
		monochrome=true
		)
public class TestRunner {

}
