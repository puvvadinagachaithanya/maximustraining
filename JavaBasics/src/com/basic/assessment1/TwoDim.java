package com.basic.assessment1;

public class TwoDim {
	public static void main(String[] args) {

		String[][] twoDimArrary = new String[][] {{"Rama","Sita","Krishna"},
			                                     {"Ramesh","Sushma","Sagar"}};

		String[] oneDimArrary = new String[5];

//		twoDimArrary[0][0] = "Rama";
//		twoDimArrary[0][1] = "Sita";
//		twoDimArrary[0][2] = "Krishna";
//
//		twoDimArrary[1][0] = "Sushma";
//		twoDimArrary[1][1] = "Sagar";
//		twoDimArrary[1][2] = "Pavan";
		
		int i = 0;

		for (String[] array : twoDimArrary) {

			for (String element : array) {

				if (element.startsWith("S")) {
					oneDimArrary[i] = element;
					i++;
				}

			}
		}

		for (String ele : oneDimArrary) {
			System.out.println(ele);
		}

	}
}
