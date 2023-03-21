import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Fondo {
	private Image Fondo;
	   public Fondo() {
		   try {
	      Fondo = ImageIO.read(new File("src/files/FoondoMapa1.png"));
	   }catch(IOException e) {
		    System.out.println("No existe fondo");
		    }
	}
	
	public Image getFondo() {
		return Fondo;
	}
	public void paintComponentFondo(Graphics g) {
		g.drawImage(Fondo, 0, 0, null);
	    g.drawImage(Fondo, 500, 0, null);
	}
}
