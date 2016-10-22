package com.ashish.datastructure;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {

		// Create a hash map
		Hashtable<String, Double> balance = new Hashtable<String, Double>();
		Enumeration<String> names;
		String str;
		double bal;

		balance.put("Ashu", new Double(3434.34));
		balance.put("Kazi", new Double(123.22));
		balance.put("Ayan", new Double(1378.00));
		balance.put("Daisy", new Double(99.22));
		balance.put("Qadir", new Double(-19.08));

		// Show all balances in hash table.
		names = balance.keys();
		while(names .hasMoreElements()){
			str = names.nextElement();
			System.out.println("key: " + str + ", value: " + balance.get(str));
		}
		
		// Deposit 1000 in Ashu's account
		bal = balance.get("Ashu");
		bal+=1000;
		balance.put("Ashu", bal);
		
		System.out.println("Ashu's new balance: " + balance.get("Ashu"));

	}

}
