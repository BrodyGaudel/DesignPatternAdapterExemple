package com.brody.ancien.adapter;

import com.brody.ancien.Vga;
import com.brody.standard.Hdmi;

public class HdmiVgaAdapter implements Hdmi {

	private Vga vga;
	
	public void setVga(Vga vga) {
		this.vga = vga;
	}
	
	@Override
	public void afficher(byte[] data) {
		vga.print( new String(data));
	}

}
