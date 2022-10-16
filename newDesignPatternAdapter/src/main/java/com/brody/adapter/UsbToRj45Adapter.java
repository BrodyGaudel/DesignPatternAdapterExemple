package com.brody.adapter;

import com.brody.ancien.Rj45;
import com.brody.standard.Usb;

public class UsbToRj45Adapter implements Usb {
	
	private Rj45 rj45;
	
	public void setRj45(Rj45 rj45) {
		this.rj45 = rj45;
	}

	@Override
	public void tansfert(byte[] data) {
		
		rj45.rjTransfert( new String(data));
	}

}
