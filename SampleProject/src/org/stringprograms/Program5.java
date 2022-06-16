package org.stringprograms;

public class Program5 {
	
		
		public static void main(String[] args) {
			String s="automation tester";
			String output="";
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
		if (output.indexOf(c)==-1) {
			output=output+c;
			
		}	
		
			}
			System.out.println(output);
	}}