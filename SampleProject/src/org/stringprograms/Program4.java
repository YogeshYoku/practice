package org.stringprograms;

public class Program4 {
	public static void main(String[] args) {
		String s="automation tester";
		String output="";
		for (int i =s.length()-1; i>=0; i--) {
			char charAt = s.charAt(i);
			output=output+charAt;
		}
		System.out.println(output);
			
			
		}
	}


