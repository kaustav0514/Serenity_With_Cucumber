package com.jpetstore.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features ="src/test/resources/features" ,
		glue = "com/jpetstore/cucumber/steps",
//		dryRun = true,
		strict = true,
		monochrome = true,
		tags = "@order1"
//		plugin = ""
		
		
		
		)

public class UserRegistrationRunner {

}
