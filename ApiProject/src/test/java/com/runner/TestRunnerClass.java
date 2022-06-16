package com.runner;

import org.junit.runner.RunWith;

import com.base.Baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Address.feature",snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE,dryRun = false,glue= {"com.stepdefinition"},monochrome=true)
public class TestRunnerClass extends Baseclass{
	
	
	
/*
		@AfterClass
		public static void afterClass() throws IOException {
			String path = System.getProperty("user.dir");
			

		Reporting.generateJVMReport(path+getPropertyValue("jsonReportPath"));
		}*/
		
		
		}



