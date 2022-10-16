package com.brody.ancien;

public class VideoProjecteur implements Vga {

	@Override
	public void print(String data) {
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		System.out.println(data.toUpperCase());
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		
	}
	

}
