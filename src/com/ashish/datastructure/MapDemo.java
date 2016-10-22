package com.ashish.datastructure;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		// Adding elemets in the map...
		for (int i = 1; i < 10; i++) {
			map.put("Object" + i, i);
		}

		System.out.println("Keys in the map: ");
		Set<String> keyset = map.keySet();
		for (String key : keyset) {
			System.out.println(key);
		}

		Set<Entry<String, Integer>> mapSet = map.entrySet();
		Iterator<Entry<String, Integer>> mapItr = mapSet.iterator();

		System.out.println("Map Elements: ");
		while (mapItr.hasNext()) {
			Entry<String, Integer> element = mapItr.next();
			System.out.println("key: " + element.getKey() + ", " + "value: " + element.getValue());
		}

		// Put all the elements of this map into another map...
		Map<String, Integer> nextMap = new TreeMap<String, Integer>();
		nextMap.putAll(map);

		Set<Entry<String, Integer>> mapSet2 = nextMap.entrySet();
		Iterator<Entry<String, Integer>> mapItr2 = mapSet2.iterator();

		System.out.println("Next Map Elements in sorted order: ");
		while (mapItr2.hasNext()) {
			Entry<String, Integer> element2 = mapItr2.next();
			System.out.println("key: " + element2.getKey() + ", " + "value: " + element2.getValue());
		}

		// Collections View : Containing all the values in the map...
		System.out.println("Collection View of the map");
		Collection<Integer> coll = nextMap.values();
		for(Integer val : coll){
			System.out.print(val + " ");		
		}	
	}
}