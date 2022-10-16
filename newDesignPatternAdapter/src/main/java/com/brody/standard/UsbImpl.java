package com.brody.standard;

import java.nio.charset.StandardCharsets;

public class UsbImpl implements Usb {

	@Override
	public void tansfert(byte[] data) {
		System.out.println("********* USB START TRANSFERT DATA *********");
		System.out.println(new String(data, StandardCharsets.UTF_8));
		System.out.println("********* USB END TRANSFERT DATA *********");
		
	}

}
