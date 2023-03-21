package Mecanismo;
import java.awt.*;
import javax.imageio.*;
import java.io.*;


public class PisoMapa {
	private int x;
	private int y;
	private int xr;
	private Image imagenPiso;
	
	public int uX;
	
	public PisoMapa() {
		x=0;
		xr=0;//-765;
		y = 630;
	    try {
	    imagenPiso = ImageIO.read(new File("src/files/piso2.png"));
	    }catch(IOException e) {
		    System.out.println("No existe fondo piso");
		    }
	    
	}
	public Image getPisoImg() {
	return imagenPiso;
}
	public int repitePiso(int Mx) {
		return x+xr-Mx;
	}
	public void paintComponentPiso(Graphics g,int Mx) {
		xr=-765;
    
			 for(int i=0;i<25;i++) {   
		    	g.drawImage(imagenPiso,repitePiso(Mx),y, null);
		    	xr+=765;
		}
	}
}
	
	
	
	
	
	
	
	
	
	
