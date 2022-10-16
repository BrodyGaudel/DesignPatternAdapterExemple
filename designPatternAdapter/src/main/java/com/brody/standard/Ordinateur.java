package com.brody.standard;

public class Ordinateur {

	private Hdmi hdmi;
	
	public void setHdmi(Hdmi hdmi) {
		this.hdmi = hdmi;
	}

	public void affiche(byte[] data) {
		hdmi.afficher(data);
	}
	
	

}
