package org.fb;

public class StringExamples {
	static String s="hello";
	static String s1="Hello";
	
	
	public static void main(String[] args) {
		char charAt = s.charAt(0); //Returns the character at the specified index (position)	
		System.out.println(charAt);
		int compareTo = s.compareTo(s1);//Compares two strings lexicographically	
		System.out.println(compareTo); //It Returns a Value If both the Strings are Eqaul means it returns 0
		int compareToIgnoreCase = s.compareToIgnoreCase(s1);//It Will not Consider whether the String is uppercase or lowercase
		System.out.println(compareToIgnoreCase); 
		String concat = s.concat(s1); //Appends a string to the end of another string	
		System.out.println(concat);
		boolean contains = s.contains("l");//Checks whether a string contains a sequence of characters	
		System.out.println(contains);
		boolean contentEquals = s.contentEquals("Hello");//Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer	
		System.out.println(contentEquals);// It will return false because we have given Capital H.
		char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};//Returns a String that represents the characters of the character array	
		String myStr2 = "";
		myStr2 = myStr2.copyValueOf(myStr1);
		System.out.println("Returned String: " + myStr2);
		//or we can also give
		String copyValueOf = myStr2.copyValueOf(myStr1,0,5);
		System.out.println(copyValueOf);
		boolean endsWith = s.endsWith("o");//Checks whether a string ends with the specified character(s)	
		System.out.println(endsWith);
		boolean equals = s.equals("hEllo");//Compares two strings. Returns true if the strings are equal, and false if not	
		System.out.println(equals);
		boolean equalsIgnoreCase = s.equalsIgnoreCase("hEllO");//Compares two strings, ignoring case considerations	
		System.out.println(equalsIgnoreCase);
		int hashCode = s.hashCode();//Returns the hash code of a string	
		System.out.println(hashCode);
		int indexOf = s.indexOf('l');//Returns the position of the first found occurrence of specified characters in a string	
		System.out.println(indexOf);
		boolean empty = s.isEmpty();//Checks whether a string is empty or not	
		System.out.println(empty);
		String s2="";
		boolean blank = s2.isBlank();//Checks whether a string is empty or not	
		System.out.println(blank);
		int lastIndexOf = s.lastIndexOf('l');//Returns the position of the last found occurrence of specified characters in a string	
		System.out.println(lastIndexOf);
		int length = s.length();//Returns the length of a specified string	
		System.out.println(length);
		boolean matches = s.matches("hello");//Searches a string for a match against a regular expression, and returns the matches	
		System.out.println(matches);
		String s3="mallo";
		String replace = s3.replace('m', 'h');//Searches a string for a specified value, and returns a new string where the specified values are replaced	
		System.out.println(replace);
		String replaceFirst = s3.replaceFirst("l", "i");//Replaces the first occurrence of a substring that matches the given regular expression with the given replacement	
		System.out.println(replaceFirst);
		String replaceAll = s3.replaceAll(s3, s2);//Replaces each substring of this string that matches the given regular expression with the given replacement	
		System.out.println(replaceAll);
		String s4="Hello-Welcome-to-Java-World";
		String[] split = s4.split("-");
		System.out.println(split);
		for(int i=0;i<split.length;i++) {
			System.out.println("------->"+split[i]);
		}
		String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("@", 2);
 
        for (String a : arrOfStr) {
            System.out.println(a);
        }
	 
boolean startsWith = s.startsWith("hel");//Checks whether a string starts with specified characters	
System.out.println(startsWith);
	String substring = s.substring(1);//Returns a new string which is the substring of a specified string	
	System.out.println(substring);
String substring2 = s.substring(1, 3);//3 minus one last la irunthy 2 words the print agum
System.out.println(substring2);
String lowerCase = s4.toLowerCase();
String uppercase=s4.toUpperCase();
System.out.println(lowerCase+uppercase);
String s6="java program          ";//Remove unwanted space after the string
String trim = s6.trim();
System.out.println(trim);
String valueOf = s.valueOf(length);
System.out.println(valueOf);

}
}	