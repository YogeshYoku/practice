package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reporting.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty",
		"json:src/test/resources/Reports/cucumber.json" }, features = "src/test/resources", glue = {
				"com.stepdefinition" })
public class TestRunnerClasss {

	@AfterClass
	public static void afterClass() {
		Reporting.generateJVMReport(
				"C:\\Users\\orton\\eclipse-workspace\\CucumberFramework\\src\\test\\resources\\Reports\\cucumber.json");

	}
}
