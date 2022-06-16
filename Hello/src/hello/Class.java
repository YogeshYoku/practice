package hello;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Class {
	
public static void main(String[] args) {

	
	Map<Integer, String>mp=new LinkedHashMap<Integer, String>();
	mp.put(1, "Yogesh");
	mp.put(2, "Vijay");
	mp.put(3, "Kamal");
	mp.put(4, "santhosh");
	mp.put(5, "Balaji");
	System.out.println(mp);
	Set<Integer> keySet = mp.keySet();
	System.out.println(keySet);
	Collection<String> values = mp.values();
	System.out.println(values);
	String remove = mp.remove(1);
	System.out.println(remove);
	System.out.println(mp);
	boolean containsKey = mp.containsKey(2);
	System.out.println(containsKey);
	boolean containsValue = mp.containsValue("Balaji");
	System.out.println(containsValue);
	String string = mp.get(4);
	System.out.println(string);
	Set<Entry<Integer, String>> entrySet = mp.entrySet();
	for (Entry<Integer, String> entry : entrySet) {
		//System.out.println(entry);
		Integer key = entry.getKey();
		System.out.println(key);
		String value = entry.getValue();
		System.out.println(value);
		
		
	}

}
	
}

