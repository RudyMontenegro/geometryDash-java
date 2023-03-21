package Mecanismo;

import java.awt.*;
import javax.imageio.*;
import javax.swing.ImageIcon;

import java.io.*;

public class ObjetoJuego {
    private String tipo;
    private ImageIcon img;
    private Image imgObs;
    public int numTipo;
    public ObjetoJuego(String Tipo) {
		tipo = Tipo;
        setImagen();
}
	private void setImagen() {
		// OBSTACULO UNICO JUGADOR
		if(tipo=="jugador") {
			img = new ImageIcon("src/files/CuadroJugador.png");
			imgObs = img.getImage();
			numTipo =0;
			//OBJETO TIPO OBSTACULO PRIORIDAD 1
		}else if(tipo=="cubo") {
			img = new ImageIcon("src/files/CuadroObs.png");
			imgObs = img.getImage();
			numTipo =1;
		}else if(tipo=="obsComun") {
			img = new ImageIcon("src/files/CuadroObs2.png");
			imgObs = img.getImage();
			numTipo =1;
		}else if(tipo=="semiPiso") {
				img = new ImageIcon("src/files/SemiPiso.png");
				imgObs = img.getImage();
				numTipo =1;
				//OBJETO ESPINAS PRIORIDAD 3
		}else if(tipo=="espinaN") {
			img = new ImageIcon("src/files/espinaVeta.png");
			imgObs = img.getImage();
			numTipo =3;
		}else if(tipo=="espinaS") {
			img = new ImageIcon("src/files/EspinaS.png");
			imgObs = img.getImage();
			numTipo =3;
		}else if(tipo=="espinaO") {
			img = new ImageIcon("src/files/EspinaO.png");
			imgObs = img.getImage();
			numTipo =3;
		}else if(tipo=="espinas") {
			img = new ImageIcon("src/files/Espinillas3.png");
			imgObs = img.getImage();
			numTipo =3;
		}else if(tipo=="espinasS") {
			img = new ImageIcon("src/files/EspinillasS.png");
			imgObs = img.getImage();
			numTipo =3;
			//OBJETOS ESPICIALES 
		}else if(tipo=="volar") {
			img = new ImageIcon("src/files/ini.png");
			imgObs = img.getImage();
			numTipo =4;
		}else if(tipo=="tpUp") {
			img = new ImageIcon("src/files/tpUp2.png");
			imgObs = img.getImage();
			numTipo =6;
		}
		else if(tipo=="jump") {
			img = new ImageIcon("src/files/jump1.png");
			imgObs = img.getImage();
			numTipo =5;
		}
		else if(tipo=="ganar") {
			img = new ImageIcon("src/files/winner.png");
			imgObs = img.getImage();
			numTipo =8;
		}
		//OBJETO SIN EFECTO
		else if(tipo=="punto") {
			img = new ImageIcon("src/files/jump.png");
			imgObs = img.getImage();
			numTipo =7;
		}
	}
	public Image getImagen() {
	 return imgObs;
	}
	public String getTipo() {
		return tipo;
	}
}

		
	

