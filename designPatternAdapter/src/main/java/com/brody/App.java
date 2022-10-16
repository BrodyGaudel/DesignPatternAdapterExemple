package com.brody;

import com.brody.ancien.VideoProjecteur;
import com.brody.ancien.adapter.HdmiVgaAdapter;
import com.brody.standard.HdmiImpl;
import com.brody.standard.HdmiImpl2;
import com.brody.standard.Ordinateur;

/**
 * Design Patern Adapter
 * Il existe deux implementation de ce design: composite (composition)  et heritage (extends)
 * L'inconvénient de l'heritage c'est le couplage fort car il ne peux etre utilisé que pour la class dont il herite
 * L'avantage de la composition c'est qu'il peut etre reutilsé
 * Ici nous avons fait la composition
 */
public class App 
{
    public static void main( String[] args )
    {
    	String data = "Hello World";
    	Ordinateur ordinateur = new Ordinateur();
    	
    	ordinateur.setHdmi(new HdmiImpl());
    	ordinateur.affiche(data.getBytes());
    	
    	ordinateur.setHdmi(new HdmiImpl2());
    	ordinateur.affiche(data.getBytes());
    	
    	HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
    	hdmiVgaAdapter.setVga( new VideoProjecteur());  //Brancher le videoprojecteur à l'adapteur
    	ordinateur.setHdmi(hdmiVgaAdapter); //brancher l'adapter à l'ordinateur
    	ordinateur.affiche(data.getBytes());
    	
    	
    }
}
