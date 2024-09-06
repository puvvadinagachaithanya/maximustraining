package com.training.quest6;

public class International implements ICuisine {

	@Override
	public String[] showMenus(String type) {

		switch (type) {
		case "Starter": {
			return new String[] { "Tuna empanadillas", "Bacon rings" };
		}
		case "Desert": {
			return new String[] { "pastries","puddings" };
		}
		default: {
			return new String[] { "Pizza" };
		}
		}

	}

}
