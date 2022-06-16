package org.basisprograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringOccurance {
	public static void main(String[] args) {
		String s="java";
		Map<Character, Integer>map=new LinkedHashMap<>();
			
		for(int i=0;i<s.length();i++) {
			char charAt = s.charAt(i);
			if(map.containsKey(charAt)) {
			Integer integer = map.get(charAt);
			map.put(charAt, integer+1);
			
			}else {
				map.put(charAt, 1);
			}
System.out.println(map);				
		}}}