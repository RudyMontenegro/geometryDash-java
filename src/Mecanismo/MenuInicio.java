package Mecanismo;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuInicio extends JFrame implements ActionListener{
fondoVentana f1 = new fondoVentana();
private int vn = 7;
private int nm= 1;
private static gestionAudio ag1;
JButton jugar,velocidadN,velocidadR,mapa1,mapa2;

public static void main (String args[]){
	ag1 = new gestionAudio(3);
    MenuInicio frame = new MenuInicio();
    frame.setVisible(true);
}

	   public MenuInicio() {
	   	setVisible(true );
		setTitle("GemotryDash");
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		ComponentesMenu();
	   }
	   private void ComponentesMenu() {
		   f1.setBounds(0, 0, 1365, 750);
			add(f1);
			jugar = new JButton(new ImageIcon("src/files/menu/bjugar.png") );
			jugar.setBounds(600, 550, 150,150);
			jugar.setRolloverIcon(new ImageIcon("src/files/menu/bjugarR.png") );
			velocidadN = new JButton(new ImageIcon("src/files/menu/normal.png") );
			velocidadN.setBounds(350, 250, 300,80);
			velocidadN.setRolloverIcon(new ImageIcon("src/files/menu/normalR.png") );
			velocidadR = new JButton(new ImageIcon("src/files/menu/rapido.png") );
			velocidadR.setBounds(750, 250, 300,80);
			velocidadR.setRolloverIcon(new ImageIcon("src/files/menu/rapidoR.png") );
			mapa1 = new JButton(new ImageIcon("src/files/menu/botonMapa1.png") );
			mapa1.setBounds(350,450,300,80);
			mapa1.setRolloverIcon(new ImageIcon("src/files/menu/botonMapa1R.png") );
			mapa2 = new JButton(new ImageIcon("src/files/menu/botonMapa2.png") );
			mapa2.setBounds(750, 450, 300,80);
			mapa2.setRolloverIcon(new ImageIcon("src/files/menu/botonMapa2R.png") );
			add(jugar);
			add(velocidadN);
			add(velocidadR);
			add(mapa1);
			add(mapa2);
			jugar.addActionListener(this);
			velocidadN.addActionListener(this);
			velocidadR.addActionListener(this);
			mapa1.addActionListener(this);
			mapa2.addActionListener(this);
		}

	   
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==velocidadN) {
          vn=5;
	    }
		if(e.getSource()==velocidadR) {
			vn=7;
		}if(e.getSource()==mapa1) {
			nm=1;
		}
		if(e.getSource()==mapa2) {
			nm=2;
		}
		if(e.getSource()==jugar) {
			ag1.para();
			 ProcesoMapa p1 = new ProcesoMapa(nm,vn);  
		}
	  
	   
}

	

	

class fondoVentana extends JPanel{
	private ImageIcon img;
    private Image imgObs;
    private ImageIcon img2;
    private Image imgObs2;
    private ImageIcon img3;
    private Image imgObs3;
    private ImageIcon img4;
    private Image imgObs4;
       public fondoVentana() {
    	   img = new ImageIcon("src/files/menu/fondoMenu.jpg");
    	   imgObs = img.getImage();
    	   img2 = new ImageIcon("src/files/menu/titulo4.png");
    	   imgObs2 = img2.getImage();
    	   img3 = new ImageIcon("src/files/menu/Tvelocidad.png");
    	   imgObs3 = img3.getImage();
    	   img4 = new ImageIcon("src/files/menu/selM.png");
    	   imgObs4 = img4.getImage();
       }
       public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(imgObs, 0, 0, null);
			g.drawImage(imgObs2,450,50, null);
			g.drawImage(imgObs3, 450, 150, null);
			g.drawImage(imgObs4,450,350, null);
	   
}
}
}






   