package org.datatable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TwoDWithHeader {
	
	public static void main(String[] args) {
		
	List<LinkedHashMap<String, String>>emp=new ArrayList<LinkedHashMap<String,String>>();
	LinkedHashMap<String, String>m1=new LinkedHashMap<String, String>();
	m1.put("name", "Yogesh");
	m1.put("email", "yogesh@gmail.com");
	m1.put("course", "java");
	LinkedHashMap<String, String>m2=new LinkedHashMap<String, String>();
	m2.put("name", "Yogesh");
	m2.put("email", "yogesh@gmail.com");
	m2.put("course", "API");
	LinkedHashMap<String, String>m3=new LinkedHashMap<String, String>();
	m3.put("name", "Yogesh");
	m3.put("email", "yogesh@gmail.com");
	m3.put("course", "java");
	emp.add(m1);
	emp.add(m2);
	emp.add(m3);
	LinkedHashMap<String, String> linkedHashMap = emp.get(1);
	String string = linkedHashMap.get("course");
	System.out.println(string);
	}
	
	

}
