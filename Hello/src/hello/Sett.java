package hello;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sett {
	public static void main(String[] args) {
		Set set=new LinkedHashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		System.out.println(set);
		boolean remove = set.remove(10);
		System.out.println(remove);
		System.out.println(set);
		
		
		
	}

}
