package com.impl;

import com.interfaces.CompactDisc;

public class BlankDisc1 implements CompactDisc {

	
	private String title ;
	private String artist;
	public BlankDisc1(String title, String artist)
	{
	   this.artist=artist;
	   this.title=title;
	}
	
	public void play() {
			System.out.println("playing "+title +" by "+artist);
	}
	
	
}
