package com.funcassign.game;

public class GameMain {

	public static void main(String[] args) {
		
		IGame game = ()-> System.out.println("Indoor Games: Tennis, Carroms");
		game.showGames();
		
		game = ()-> System.out.println("Outdoor games: Cricket, football");
		game.showGames();

	}

}
