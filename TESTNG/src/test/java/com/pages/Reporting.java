package com.pages;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class Reporting {
	public static void generateJVMReport(String jsonFile) {
		File file=new File("C:\\Users\\orton\\eclipse-workspace\\CucumberFramework\\src\\test\\resources\\Reports");
		Configuration configuration=new Configuration(file, "AdactinHotel");
		configuration.addClassifications("OS", "windows 11");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Version", "101");
		List<String>jsonFiles=new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder=new ReportBuilder(jsonFiles,configuration);
		builder.generateReports();


	}
}
