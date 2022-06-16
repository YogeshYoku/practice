package org.stringprograms;

public class Program9 {
	public static void main(String[] args) {
		String s="1+3+4-3+4/1*2";
		char[] charArray = s.toCharArray();
		char d=charArray[0];
		int value = Character.getNumericValue(d);
		for (int i = 0; i < charArray.length; i++) {
			char e=charArray[i];
			switch (e) {
			case '+':
				int add = Character.getNumericValue(charArray[i+1]);
				value=value+add;
				break;
			case '-':
				int sub = Character.getNumericValue(charArray[i+1]);
				value=value-sub;
				break;
			case '*':
				int multiply = Character.getNumericValue(charArray[i+1]);
				value=value*multiply;
				break;
			case '/':
				int divison = Character.getNumericValue(charArray[i+1]);
				value=value/divison;
				break;

			default:
				break;
			}
			
	}
		System.out.println(value);	
	}

}
