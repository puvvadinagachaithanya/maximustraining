package com.training.quest6;

public class Restaurant {

	public static void main(String[] args) {
		ICuisine cusine = new International();
		String[] starteritems = cusine.showMenus("Starter");
		for (String item : starteritems) {
			System.out.println("International Starter items :" + item);
		}

		String[] desertItems = cusine.showMenus("Desert");
		for (String item : desertItems) {
			System.out.println("International Desert Items :" + item);
		}

		cusine = new Indian();
		String[] indianStarterItems = cusine.showMenus("Starter");
		for (String item : indianStarterItems) {
			System.out.println("Indian Starter Items:" + item);
		}

		String[] indianDesertItems = cusine.showMenus("Desert");
		for (String item : indianDesertItems) {
			System.out.println("Indian Desert Items:" + item);
		}
	}

}
