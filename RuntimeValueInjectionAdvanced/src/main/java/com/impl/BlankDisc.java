package com.impl;

import com.interfaces.CompactDisc;

public class BlankDisc implements CompactDisc {

	
	private String title ;
	private String artist;
	public BlankDisc(String title, String artist)
	{
	   this.artist=artist;
	   this.title=title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void play() {
			System.out.println("playing "+title +" by "+artist);
	}
	
	
}
