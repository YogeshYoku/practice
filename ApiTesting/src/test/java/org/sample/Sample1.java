package org.sample;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class Sample1 {
public static void main(String[] args) throws IOException, ParseException {
		FileReader reader=new FileReader("C:\\Users\\orton\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\Sample1\\sample.json");
		JSONParser jsonparser=new JSONParser();
		Object obj = jsonparser.parse(reader);
	//	System.out.println(obj);
		JSONObject j=(JSONObject)obj;
		Object page = j.get("page");
		System.out.println(page);
		Object perPage = j.get("per_page");
		System.out.println(perPage);
		Object total = j.get("total");
		System.out.println(total);
		Object totalPages = j.get("total_pages");
		System.out.println(totalPages);
		Object data = j.get("data");
		//System.out.println(data);
		JSONArray a=(JSONArray)data;
		for (int i = 0; i <a.size(); i++) {
		Object eachData = a.get(i);
		//System.out.println(eachData);
		JSONObject j1=(JSONObject)eachData;
		System.out.println(j1.get("id"));
		System.out.println(j1.get("first_name"));
		System.out.println(j1.get("last_name"));
		System.out.println(j1.get("avatar"));
		Object support = j.get("support");
		//System.out.println(support);
		JSONObject jsupport=(JSONObject)support;
		System.out.println(jsupport.get("url"));
		System.out.println(jsupport.get("text"));
		
	}

}
}