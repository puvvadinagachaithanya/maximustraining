package com.funcassign.menu;

public class MenuMain {

	public static void main(String[] args) {

		IMenu menu = items -> {
			for (String item : items) {
				System.out.println("Items :" + item);

			}
		};
		menu.printMenu(new String[] { "Starter1", "Starter2" });
		menu.printMenu(new String[] { "Desert1", "Desert2" });

	}

}
