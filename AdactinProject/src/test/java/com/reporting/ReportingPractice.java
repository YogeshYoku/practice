package com.reporting;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.base.BaseClass;
import com.graphbuilder.struc.LinkedList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingPractice extends BaseClass {
	private static void generateeJVMReport(String jsonFile) throws IOException {
	 String path = System.getProperty("user.dir");
	 File file=new File(path+getPropertyValue("jvmReportPath"));
	 Configuration config=new Configuration(file, "AdactinHotel");
	 config.addClassifications("os", "Windows11");
	 config.addClassifications("Browser", "Chrome");
	 config.addClassifications("version", "101");
	 List<String>jsonFiles=new ArrayList<>();
	 jsonFiles.add(jsonFile);
	 ReportBuilder builder=new ReportBuilder(jsonFiles, config);
	 builder.generateReports();
	// List<String>emp=new ArrayList<String>();
	 
	List<ArrayList<String>>emp=new ArrayList<ArrayList<String>>();
	List<ArrayList<String>>emp1=new ArrayList<ArrayList<String>>();
	List<ArrayList<String>>emp2=new ArrayList<ArrayList<String>>();
	List<String>emp11=new ArrayList<String>();
	Map<String, String>emp5=new LinkedHashMap<String, String>();
    List<LinkedHashMap<String, String>>emp66=new ArrayList<LinkedHashMap<String, String>>();
	
	 
		

	}

}
