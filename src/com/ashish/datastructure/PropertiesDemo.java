package com.ashish.datastructure;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String[] args) {
		Properties capitals = new Properties();
		Set<Object> states;
		String str;

		capitals.put("Illinois", "Springfield");
		capitals.put("Missouri", "Jefferson City");
		capitals.put("Washington", "Olympia");
		capitals.put("California", "Sacramento");
		capitals.put("Indiana", "Indianapolis");

		// Show all the stated and their capitals.
		states = capitals.keySet(); // get set-view of keys
		Iterator<Object> itr = states.iterator();

		while (itr.hasNext()) {
			str = (String) itr.next();
			System.out.println("Country: " + str + ", Capital: " + capitals.getProperty(str));
		}
		
		str = capitals.getProperty("Florida", "Not Found");
		System.out.println("The Capital of Florida is " + str);

	}

}