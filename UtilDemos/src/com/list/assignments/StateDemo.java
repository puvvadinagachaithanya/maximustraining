package com.list.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StateDemo {

	public static void main(String[] args) {

		Map<String, List<String>> mapList = new HashMap<String, List<String>>();
		List<String> apList = new ArrayList<String>();
		apList.add("Kurnool");
		apList.add("Nandyal");
		mapList.put("AP", apList);

		List<String> tsList = new ArrayList<String>();
		apList.add("Hyderabad");
		apList.add("Warangal");
		mapList.put("TS", tsList);

		List<String> kaList = new ArrayList<String>();
		apList.add("Bangalore");
		apList.add("Mangalore");
		mapList.put("KA", kaList);

		Set<String> mapKeys = mapList.keySet();

		
		for (String key : mapKeys) {
			for (String name : mapList.get(key)) {
				System.out.println(name);
			}
		}

	}

}
