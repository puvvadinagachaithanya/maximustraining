package com.streams.meth;

import java.util.Arrays;
import java.util.List;

public class SportsImpl implements ISports {

	@Override
	public List<String> showGames() {

		return Arrays.asList("Cricket", "Football");
	}

}
