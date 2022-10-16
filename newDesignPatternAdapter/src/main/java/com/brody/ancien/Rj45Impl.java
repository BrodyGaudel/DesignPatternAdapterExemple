package com.brody.ancien;

public class Rj45Impl implements Rj45 {

	@Override
	public void rjTransfert(String data) {
		System.out.println("~~~~~~~~~  RJ45 START TRANSFERT~~~~~~~~~~");
		System.out.println(data.toUpperCase());
		System.out.println("~~~~~~~~~  RJ45 END TRANSFERT~~~~~~~~~~");
		
	}

}
