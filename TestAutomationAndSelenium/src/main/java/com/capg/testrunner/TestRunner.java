package com.capg.testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "G:\\webprogramming\\TestAutomationAndSelenium\\src\\main\\java\\com\\capg\\feature\\login.feature", glue = {
		"com.capg.stepdefinition" },strict=true,dryRun=false)
public class TestRunner {

}
