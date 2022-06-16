package com.runner;

import org.junit.runner.RunWith;

import com.base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","json:src/test/resources/Reports/cucumber/json"},features= "src/test/resources",glue= {"com.stepdefinition"},dryRun=false,monochrome=true,snippets=SnippetType.CAMELCASE)
public class Test extends BaseClass {

}
