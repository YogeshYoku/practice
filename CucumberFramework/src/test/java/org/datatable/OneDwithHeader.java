package org.datatable;

import java.util.LinkedHashMap;
import java.util.Map;

public class OneDwithHeader {
	public static void main(String[] args) {
		Map<String, String> m=new LinkedHashMap<String, String>();
		m.put("name", "yogesh");
		m.put("email", "Yogesh@gmail.com");
		m.put("Course", "java");
		String name = m.get("name");
		 
			
			
		
		System.out.println(name);
	}

}
