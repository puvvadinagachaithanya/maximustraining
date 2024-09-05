package com.over.quest1;

public class OverloadMain {
	public static void main(String[] args) {

		Employee[] empArray = new Employee[3];

		empArray[0] = new Employee("Chaitu", "Manager");

		empArray[1] = new Employee("SriPriya", "Director");

		empArray[2] = new Employee("Pavan", "Programmer");

		for (Employee employee : empArray) {
			switch (employee.designation) {
			case "Programmer": {
				employee.calcBonus(10000);
				System.out.println("\n");
				break;
			}
			case "Manager": {
				employee.calcBonus(15000, "1000");
				System.out.println("\n");
				break;
			}
			case "Director": {
				employee.calcBonus(15000, "1000", "1500");
				System.out.println("\n");
				break;
			}
			default:{
				System.out.println("In correct designation");
			}
			}
		}

	}
}
