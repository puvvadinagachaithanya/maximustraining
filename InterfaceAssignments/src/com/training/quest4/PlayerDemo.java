package com.training.quest4;

public class PlayerDemo {

	public static void main(String[] args) {
		IMediaPlayer player = new VLCMediaPlayer();
		player.playMusic();
		player.dowloadMusic();

		player = new WindowsMediaPlayerOne();
		player.playMusic();
		player.dowloadMusic();

	}

}
