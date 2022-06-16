package com.stepdefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CommonSteps {
public static void main(String[] args) throws IOException {
	Properties properties=new Properties();
	String path = System.getProperty("user.dir");
	FileInputStream stream=new FileInputStream(path+"\\src\\test\\resources\\config.properties");
properties.load(stream);
Object url = properties.get("browserName");
String s=(String)url;
System.out.println(s);

}

}
