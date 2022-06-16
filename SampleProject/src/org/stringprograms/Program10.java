package org.stringprograms;

public class Program10 {
public static void main(String[] args) {
String s="automationtester";
String output="";
for (int i = 0; i <s.length(); i++) {
char c = s.charAt(i);
if(i%2==1) {
output=output+Character.toUpperCase(c);
}
else {
output=output+c;
}
}
System.out.println(output);
}
}
