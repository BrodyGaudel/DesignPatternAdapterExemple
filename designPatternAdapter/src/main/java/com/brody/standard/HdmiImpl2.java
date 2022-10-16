package com.brody.standard;

import java.nio.charset.StandardCharsets;

public class HdmiImpl2 implements Hdmi{

	@Override
	public void afficher(byte[] data) {
		System.out.println("----------- HDMI ------------");
		System.out.println(new String(data, StandardCharsets.UTF_8));
		System.out.println("----------- HDMI ------------");
		
	}

}
