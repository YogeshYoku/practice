package org.basisprograms;


public class StringExample1 {
	public static void main(String[] args) {
		int sum = 0;
		String s="abcd3ffg4hij7";
		for (int i = 0; i <s.length(); i++) {
			char c = s.charAt(i);
			if (c>='0'&&c<='9') {
				int numericValue = Character.getNumericValue(c);
				sum=sum+numericValue;
			//	System.out.println(numericValue);
				}}
			System.out.println(sum);
			
		}
	}



//This Program will get the Numerica values from the String and Add the value of that numbers.



