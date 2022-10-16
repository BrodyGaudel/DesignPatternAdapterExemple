package com.brody.model;

import com.brody.standard.Usb;

public class Ordinateur {
	
	private Usb usb;

	public void setUsb(Usb usb) {
		this.usb = usb;
	}
	
	public void affiche(byte[] data) {
		usb.tansfert(data);
	}

}
