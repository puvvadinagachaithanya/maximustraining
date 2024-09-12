package com.streams.meth;

import java.util.Arrays;
import java.util.List;

public class MethoRefDemo {

	public static void main(String[] args) {

		ISports sports = new SportsImpl();
		sports.showGames().stream().forEach(str->System.out.println(str));
		System.out.println();
		//anonymous inner
		sports = new ISports() {
			@Override
			public List<String> showGames() {
				return Arrays.asList("Crciket","Hockey");
			}
		};
		//call
		sports.showGames().stream().forEach(str->System.out.println(str));
		System.out.println();
//		lambda expression
		sports = ()->Arrays.asList("Tennis","Kabadi");
		sports.showGames().stream().forEach(str->System.out.println(str));
		
		System.out.println();
		//method reference
		//referring to static method
		ISports sports1 = Player::listOfSports;
		sports1.showGames().stream().forEach(str->System.out.println(str));
		
		sports1 = new Player()::yogaTypes;
		sports1.showGames().stream().forEach(str->System.out.println(str));

	}

}
