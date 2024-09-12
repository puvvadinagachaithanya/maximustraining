package com.streams.meth;

import java.util.Arrays;
import java.util.List;

public class Player {
	
	public static List<String> listOfSports() {
		return Arrays.asList("Cricket", "Football", "Tennis");
	}
	
	public List<String> yogaTypes() {
		System.out.println("From player class - instance method");
		return Arrays.asList("Shivananda","Asthanga","Power");
	}
}
