package com.reports;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import com.base.Baseclass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class Reporting extends Baseclass {
	public static void generateJVMReport(String jsonFile) throws IOException {
		String path = System.getProperty("user.dir");
		File file=new File(path+getPropertyValue("jvmReportPath"));
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
