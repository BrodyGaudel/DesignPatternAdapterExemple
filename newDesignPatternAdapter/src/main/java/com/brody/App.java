package com.brody;

import com.brody.adapter.UsbToRj45Adapter;
import com.brody.ancien.Rj45Impl;
import com.brody.model.Ordinateur;
import com.brody.standard.UsbImpl;

/**
 * Design Pattern Adapter!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String data = "design pattern adapter with example usb to rj45";
    	Ordinateur ordinateur = new Ordinateur();
    	
    	ordinateur.setUsb( new UsbImpl()); //branche l'usb au PC
    	ordinateur.affiche(data.getBytes());
    	
    	UsbToRj45Adapter usbToRj45Adapter = new UsbToRj45Adapter();
    	
    	usbToRj45Adapter.setRj45( new Rj45Impl()); //Brancher le RJ45 à l'adaptateur
    	ordinateur.setUsb(usbToRj45Adapter); //Brancher ensuite l'adaptateur au PC
    	ordinateur.affiche(data.getBytes());
    }
}
