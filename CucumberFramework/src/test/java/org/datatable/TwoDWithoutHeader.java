package org.datatable;

import java.util.ArrayList;
import java.util.List;

public class TwoDWithoutHeader {
	public static void main(String[] args) {
		List<ArrayList<String>>emp=new ArrayList<ArrayList<String>>();
ArrayList<String>a1=new ArrayList<String>();
a1.add("yogesh");
a1.add("yogesh@gmail.com");
a1.add("java");
ArrayList<String>a2=new ArrayList<String>();
a2.add("Vijay");
a2.add("Vijay@gmail.com");
a2.add("API");
ArrayList<String>a3=new ArrayList<String>();
a3.add("Kamal");
a3.add("kamal@gmail.com");
a3.add("sql");
	emp.add(a1);  
	emp.add(a2);  
	emp.add(a3);  
	ArrayList<String> arrayList = emp.get(2);
	String string = arrayList.get(2);
	System.out.println(string);
	
	}
}
