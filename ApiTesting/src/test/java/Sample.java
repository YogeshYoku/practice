import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class Sample {
public static void main(String[] args) throws IOException, ParseException {
		FileReader reader=new FileReader("C:\\Users\\orton\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\Sample\\sample.json");
		JSONParser jsonparder=new JSONParser();
		Object obj = jsonparder.parse(reader);
		System.out.println(obj); 
		JSONObject j=(JSONObject)obj; 
		Object objData = j.get("data");
		System.out.println(objData);
		Object objSupport = j.get("support");
		System.out.println(objSupport);
		JSONObject jData=(JSONObject)objData;
		Object objId = jData.get("id");
		System.out.println(objId);
		Object objEmail = jData.get("email");
		System.out.println(objEmail);
		Object objFirstName = jData.get("first_name");
		System.out.println(objFirstName);
		Object objLastName = jData.get("last_name");
		System.out.println(objLastName);
		Object objAvatar = jData.get("avatar");
		System.out.println(objAvatar);
		JSONObject jSupport=(JSONObject)objSupport;
		Object objurl = jSupport.get("url");
		System.out.println(objurl);
		Object objTxt = jSupport.get("text");
		System.out.println(objTxt);	
		
	}}