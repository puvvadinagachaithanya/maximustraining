package com.training.quest4;

public class VLCMediaPlayer implements IMediaPlayer {

	@Override
	public void playMusic() {
		System.out.println("Palying music by VLC player");

	}

	@Override
	public void dowloadMusic() {
		System.out.println("Downloading music song from VLC player");

	}

}
