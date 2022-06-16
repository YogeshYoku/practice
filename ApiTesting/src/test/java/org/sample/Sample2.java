package org.sample;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Data;
import com.pojo.Employee;
import com.pojo.Support;

public class Sample2 {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File file=new File("C:\\Users\\orton\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\Sample1\\sample.json");
		ObjectMapper mapper=new ObjectMapper();
		Employee e = mapper.readValue(file, Employee.class);
		String page = e.getPage();
		System.out.println(page);
		String per_page = e.getPer_page();
		System.out.println(per_page
				);
		String total = e.getTotal();
		System.out.println(total);
		String total_pages = e.getTotal_pages();
		System.out.println(total_pages);
		ArrayList<Data> data = e.getData();
		for (Data data2 : data) {
			System.out.println(data2.getId());
			System.out.println(data2.getEmail());
			System.out.println(data2.getFirst_name());
			System.out.println(data2.getLast_name());
			System.out.println(data2.getAvatar());
			Support support = e.getSupport();
			System.out.println(support.getUrl());
			System.out.println(support.getText());
		}
		
			
		}
		
	}


