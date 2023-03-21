package Mecanismo;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Puntuacion extends ObjetoJuego{
private ImageIcon imgicono;
private Image imgObsI;
private Image imgObsD1;
private Image imgObsD2;
public int d1;
public int d2;
	public Puntuacion(String Nom) {
		super(Nom);
		d1=0;
	    d2=0;
		imgicono = new ImageIcon("src/files/jump.png");
		imgObsI = imgicono.getImage();
		imgicono = new ImageIcon("src/files/fuenteNum/"+d2+".png");
		imgObsD1 = imgicono.getImage();
				imgicono = new ImageIcon("src/files/fuenteNum/"+d1+".png");
		imgObsD2 = imgicono.getImage();
	}
	public void paitnComponentPuntos(Graphics g) {
		g.drawImage(imgObsI,1000,0, null);
		g.drawImage(imgObsD1,1170,0, null);
		g.drawImage(imgObsD2,1240,0, null);
	}  
	public void setImagenes() {
		
	}
	public void setPuntos() {
		if(d1!=10) {
		imgicono = new ImageIcon("src/files/fuenteNum/"+d2+".png");
		imgObsD1 = imgicono.getImage();
				imgicono = new ImageIcon("src/files/fuenteNum/"+d1+".png");
		imgObsD2 = imgicono.getImage();
		
}else {
		d1=0;
		d2++;
		setPuntos();
	}
	}
}
