package org.basisprograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringOccurance1 {
			public static void main(String[] args) {
			String s="java goog java";
			String[] split = s.split("");
			Map<String, Integer>map=new LinkedHashMap<>();
				
			for(int i=0;i<s.length();i++) {
				char c= s.charAt(i);
				if(map.containsKey(c)) {
				Integer integer = map.get(c);
				map.put(s,+integer+1);
				
				}else {
					map.put(s, 1);
				}
	System.out.println(map);				
			}
		}}


//dout