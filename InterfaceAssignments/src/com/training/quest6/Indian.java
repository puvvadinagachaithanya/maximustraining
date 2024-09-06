package com.training.quest6;

public class Indian implements ICuisine {

	@Override
	public String[] showMenus(String type) {
		switch (type) {
		case "Starter": {
			return new String[] { "Gobi", "Panner" };
		}
		case "Desert": {
			return new String[] { "Mysore Park","Halwa" };
		}
		default: {
			return new String[] { "Dosa" };
		}
		}

	}

}
