package com.runner;


import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.reporting.Reporting;
import com.stepdefinition.*;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","json:src/test/resources/reportss/cucumber.json"},features="src/test/resources",dryRun =false,glue= {"com.stepdefinition"},monochrome=true)
public class TestRunnerClasss extends BaseClass {
	

	@AfterClass
	public static void afterClass() throws IOException {
		String path = System.getProperty("user.dir");
		

	Reporting.generateJVMReport(path+getPropertyValue("jsonReportPath"));
	}
	
	
	}


						