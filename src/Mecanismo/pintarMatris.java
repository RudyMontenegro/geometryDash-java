package Mecanismo;
import mapas.*;
import java.awt.Graphics;


public class pintarMatris {
	public MatrisJugador mat;
    private ObjetoJuego[][] MatrizObs;
    private Jugador j1;
    private GestionarMatMapa mg;
    private Puntuacion p1;
    private int cd;
    public pintarMatris(Jugador j1,Puntuacion p1,MatrisJugador mat,int nm) {
    	this.mat = mat;
    	this.j1 =j1;
    	this.p1 = p1;
    	mg = new GestionarMatMapa();
    	MatrizObs = mg.getMapa(nm);//-----------------------------------------------
    	 mat.setMatrizA(MatrizObs,this.p1);	 
    	 j1.setMat(MatrizObs);  
    	 cd = 70;  
    }
	 
	public void paintComponentMatrizObs(Graphics g,int Mx) {
		int  pdy=-70;
		    for(int i=0;i<MatrizObs.length;i++){
		    	pdy +=70;
		    int	pdx=-70;
		    		for(int j=0;j<MatrizObs[0].length;j++){
		    		  pdx = pdx+70;
		    		  if(MatrizObs[i][j]!=null) {
		    		  ObjetoJuego c1 = MatrizObs[i][j];
		    		 if(!c1.getTipo().equals("jugador")) { 
		    		  g.drawImage(c1.getImagen(),pdx-Mx,pdy, null);	    	     
		    }
		}}
	}
		    if(MovMatriz(Mx)) {
		    mat.setMat(j1);
	}
	}
	private boolean MovMatriz(int pixelR) {
	    if(pixelR-cd==0 || pixelR-cd==70) {
	    	cd = pixelR;
	    	return true;}
	    	else{
	    	return  false;
	    	}
	    }
}
