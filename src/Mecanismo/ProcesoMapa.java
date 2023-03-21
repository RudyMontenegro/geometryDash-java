package Mecanismo;

import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;
class ProcesoMapa extends JFrame{
   public ProcesoMapa(int mapa,int velocidad) {
	procesoEcenario Topografia = new procesoEcenario(mapa,velocidad); 
   	add(Topografia);
   	setVisible(true );
	setTitle("MapaPrueb");
	this.setExtendedState(MAXIMIZED_BOTH);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
}
class procesoEcenario extends JPanel{
	private int Nmapa;
	private FondoMap fondo;
	private pintarMatris obstaculo;
	private PisoMapa piso;
	private Jugador j1;
	private MatrisJugador matriz;
	private int velocidad;
    public int Mx;
    private  EfectColicion ef;
    private Puntuacion p1;
    private gestionAudio ag1;
    private gestionAudio agEfect;
    int cd;
public procesoEcenario(int nm,int vl) {
				Nmapa = nm;
				velocidad = vl;
				objetosEcsenario();
}

private void objetosEcsenario() {
	cd=0;
ag1 = new gestionAudio(Nmapa);
j1 = new Jugador("jugador");
 fondo = new FondoMap();
 p1 = new Puntuacion("p1");
 matriz = new MatrisJugador();
 obstaculo = new pintarMatris(j1,p1,matriz,Nmapa);
 piso = new PisoMapa();
 addKeyListener(j1);
 setFocusable(true);
ef = new EfectColicion();
Mx=0;
  }

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		super.paintComponent(g);
		fondo.paintComponentFondo(g);
	    piso.paintComponentPiso(g,Mx);
	    obstaculo.paintComponentMatrizObs(g,Mx);
	    j1.paitnComponentJugador(g2);
	    p1.paitnComponentPuntos(g2);
	    Mx += velocidad;

	    if(matriz.colicionBandera) {
	    repaint();	    
	    	
	    }else { 	
	    	fondo.paintComponentFondo(g);
		    piso.paintComponentPiso(g,Mx);
		    obstaculo.paintComponentMatrizObs(g,Mx);
		    p1.paitnComponentPuntos(g2);
		    cd +=25;
		    	g.drawImage(ef.setImage(),j1.x-cd,j1.y-cd, null);
		    		try{
		    	        Thread.sleep(30);
		    	        
		    	    }catch(Exception e){
		    	        System.out.println("error");       
		    	}
		       if(ef.cd>16){ 
		       agEfect = new gestionAudio(4);
		       ag1.para();
		       removeAll();     
		       j1.sleep(1000);
		       objetosEcsenario();
		       repaint();	
		       }else {
		    	   repaint();
		       }
	    }
	    }
}

class EfectColicion{
	public Image img; 
	int cd =1;
	public Image setImage() {
		try {
			img = ImageIO.read(new File("src/files/Colicion/"+cd+".png"));
		} catch (IOException e) {
			System.err.println("sin imagen colision");
		}
		cd +=cd;
		return img;
	}

}

	class FondoMap{
	private Image Fondo;
	   public FondoMap() {
		   try {
	      Fondo = ImageIO.read(new File("src/files/FoondoMapa1.png"));
	   }catch(IOException e) {
		    System.out.println("No existe fondo");
		    }
	}
	
	public void paintComponentFondo(Graphics g) {
		g.drawImage(Fondo, 0, 0, null);
	    g.drawImage(Fondo,1024 , 0, null);
	}
	}


