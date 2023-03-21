package Mecanismo;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Jugador extends ObjetoJuego implements KeyListener{
	    
	    public  int x;
	    public int y;
	    public int posMatX;
	    public int posMatY;
	    public int Mx;
	    private int cd;	   
	    private Thread hiloSaltar;
	    private Thread hiloCaer;
	    private ObjetoJuego[][] m1;
	    public  boolean swSaltar;
	    private boolean swSaltarHilo;
	    private boolean swCaer;
	    public boolean pausa;
	    private Image img; 
	    private ObjetoJuego o1;

	   public boolean swVolar;
	    public Jugador(String Nombre) {
	    	super(Nombre);    	
	        x =420;
	        y =560;
	        posMatX = 6;
	        posMatY = 8;
	        hiloSaltar = new ProcesoSaltar("proceso1",this);
	        hiloCaer = new ProcesoCaer("proceso1",this);
	        swSaltar=false;
	        swCaer=true;
	        swSaltarHilo=true;
	        swVolar=false;
	        cd=1;
	        pausa = false;
	    }	    

public void setPosMatX() {
	posMatX += 1;
}
public void setPosMatY(boolean sw) {
	if(sw) {
	posMatY += 1;
	}else{
		if(posMatY>0) {
		posMatY -= 1;	}
	}
	}

public void saltar() {
	swSaltar = true;
	for(int i=0;i<4;i++) {
    y = y-35;
    if(!swVolar)cd +=cd; 
	sleep(100);
	if(i==1||i==3) {setPosMatY(false);}
	}
	cd =1;
	swSaltar = false;
	hiloSaltar.suspend();
}
public void sleep(int x) {
	try{
        Thread.sleep(x);
        
    }catch(Exception e){
        System.out.println("error");       
}
}
public void CuadroSalta() {
	if(swSaltarHilo) {
		hiloSaltar.start();
		 swSaltarHilo = ! swSaltarHilo;
		}else {
			 hiloSaltar.resume();
}
}
public void keyPressed(KeyEvent e) {
if(condicionKey(e)) {
			if(swSaltarHilo) {
				hiloSaltar.start();
				 swSaltarHilo = ! swSaltarHilo;
				}else {
					 hiloSaltar.resume();
			}
		}
				
	
}

public void keyReleased(KeyEvent e) { 
}
public void keyTyped(KeyEvent e) {
}
public void setMat(ObjetoJuego[][] m1) {
	this.m1 = m1;
}
private boolean condicionKey(KeyEvent e) {
	boolean res = false;
	if(VolarP() && e.getKeyCode()==32) {
	res= true;
}
	return res;
}

public boolean ColisionPiso() {
	boolean res = false;
	if(posMatY<8) {
		setObj();
		if(m1[posMatY+1][posMatX]==null) {
			res = true;
		}else if(o1==this || o1.numTipo==7 || o1.numTipo==5 || o1.numTipo==3 || o1.numTipo==6 ) {
			 res = true;
		 }
}
		return res;
	}

public void Caer() {
	if(!swSaltar) {
	if(ColisionPiso()) {
		y = y+35;
       sleep(70);
       y = y+35;
		setPosMatY(true);
		System.out.println("el jugador a caido ");
}
	}
	hiloCaer.suspend();
}
public void hiloCaerJugador() {
	if(swCaer) {
		hiloCaer.start();
		swCaer = !swCaer;
		}else {
			hiloCaer.resume();
		}
}
       

public void paitnComponentJugador(Graphics g) {
	g.drawImage(setImage(),x,y, null);
}  
private boolean VolarP() {
	if(swVolar) {
		return true;
	}else {
		return !ColisionPiso();
	}
}


public Image setImage() {
	try {
		if(swVolar)cd = 6;
		img = ImageIO.read(new File("src/files/jugadorSalta/c"+cd+".png"));
	} catch (IOException e) {
		System.err.println("sin imagen colision");
	}
	return img;
}
private void setObj() {
	if(posMatY<8) {
	o1 =m1[posMatY+1][posMatX];
}
}

}
















