package com.list.custom;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>(); // we can add one null key
		//Map<Integer, String> map = new LinkedHashMap<>();// we can add one null key
		//Map<Integer, String> map = new TreeMap<>();
		map.put(1, "Raju");
		map.put(2, "Jo");
		map.put(3, "Raju");
		//map.put(null, "Raju");// accepts null keys treemap not allow null keys
		map.put(4, "David");
		map.put(5, null);
		map.put(6, "Mona");
		map.put(1, "Neeraj");
		map.put(2, "Manu");
		
		System.out.println(map);
		System.out.println(map.get(1)); // Neeraj
		System.out.println(map.get(7)); // null
//		System.out.println(map.get(null));
		System.out.println(map.getOrDefault(7,"Fred"));
		
		System.out.println(map.containsKey(6)); //true
		
		System.out.println();
		
		Set<Integer> keys =  map.keySet();
		for (Integer key : keys) {
			System.out.println(key+ " "+map.get(key));
		}

	}

}
