import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ProcesadorMapa extends JFrame{

	public ProcesadorMapa() {
	    Ecenario mapaEcenario = new Ecenario();
	    add(mapaEcenario);
	    setVisible(true);
	    setTitle("Ecenario ");
		this.setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class Ecenario extends JPanel{
	private Fondo fondoMapa;
	public Ecenario() {
	Fondo fondoMapa = new Fondo();
	}
	public void paintComponent(Graphics g) {
		 super.paintComponent(g);
		g.drawImage(fondoMapa.getFondo(), 0, 0, null);
	    g.drawImage(fondoMapa.getFondo(), 500, 0, null);;
}
}