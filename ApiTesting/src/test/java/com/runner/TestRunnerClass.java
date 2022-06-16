package com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.Baseclass;
import com.reporting.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",dryRun =false,glue= {"org.stepdefinition"},monochrome=true)
public class TestRunnerClass extends Baseclass{
	
	
	
/*
		@AfterClass
		public static void afterClass() throws IOException {
			String path = System.getProperty("user.dir");
			

		Reporting.generateJVMReport(path+getPropertyValue("jsonReportPath"));
		}*/
		
		
		}



