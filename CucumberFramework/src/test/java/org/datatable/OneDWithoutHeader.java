package org.datatable;

import java.util.ArrayList;
import java.util.List;

public class OneDWithoutHeader {
public static void main(String[] args) {
	List<String>emp=new ArrayList<String>();
emp.add("yogesh");
emp.add("Yogesh@gmail.com");
emp.add("java");
String name = emp.get(0);
System.out.println(name);

}
}