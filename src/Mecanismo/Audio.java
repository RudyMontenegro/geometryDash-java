package Mecanismo;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Audio extends Thread{
	
	public Player musicaMenu, musicMapa1, musicMapa2,explocion;
	public int x;
	
	public Audio(){
		try {
			musicaMenu = new Player(new FileInputStream("sonidos/Vostroyan Firstborn.mp3"));
			musicMapa1 = new Player(new FileInputStream("sonidos/mapa1.mp3"));
			musicMapa2 = new Player(new FileInputStream("sonidos/mapa2.mp3"));
			explocion = new Player(new FileInputStream("sonidos/exp.mp3"));
		} catch (FileNotFoundException | JavaLayerException e) {
			e.printStackTrace();
		}
	}
	public  void song(){
		try {
			switch(x) {
			case 1:	
				musicMapa1.play();	
			break;
			case 2:
				musicMapa2.play();
			break;
			case 3:
				musicaMenu.play();
			break;
			case 4:
				explocion.play();
			}
	    }catch(JavaLayerException e){
			e.printStackTrace();
		}
	}
	
public void run(){
			 song();
		   }
   
}