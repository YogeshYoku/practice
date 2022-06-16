package org.stringprograms;

public class Program8 {

	static String palindromeNumber(int a) {
		int temp=a;
		int rev=0;
	 while(a>0) {
		 int b=a/10;
		 int c=a%10;
		 rev=c+(rev*10);
		 a=b;
	 }
	 if(temp==rev) {
	return "palindrome no";
}	else {
		return "Not a Palindrom no";
	}
}
	public static void main(String[] args) {
		String palindromeNumber = palindromeNumber(12345);
		System.out.println(palindromeNumber);
	}
}