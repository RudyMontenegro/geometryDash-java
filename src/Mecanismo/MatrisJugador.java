

package Mecanismo;

import javax.swing.JOptionPane;

public class MatrisJugador {//clase sin refactorizar
    public boolean colicionBandera = true;
    boolean sw = false;
    public boolean sgtMapa= false;
    public ObjetoJuego bc = null;
   private Puntuacion p1;
   private Jugador j1;

   private ObjetoJuego[][] matObs;
   public void setMatrizA(ObjetoJuego[][] matObs,Puntuacion p1) {
  	   this.matObs = matObs;
  	   this.p1 = p1;
    }
		public void setMat(Jugador jex) {
			j1 =jex;
			interior();
			j1.setPosMatX();
			guardarObstaculos(j1.posMatY,j1.posMatX);
			matObs[j1.posMatY][j1.posMatX] = j1;
			j1.setMat(matObs);
			j1.hiloCaerJugador();
			Exterior(j1);
			rescatarObs();
		}
		private void interior() {
			int N = getObstaculo(j1.posMatY,j1.posMatX);
			if(getObstaculo(j1.posMatY,j1.posMatX+1)==5)
			{j1.CuadroSalta();
			System.out.println("jugadro salta23");
			}
			if(N==1 || N==3)colicionBandera = sw;
			if(N==8) {
				JOptionPane.showMessageDialog(null, "Ganate!!!, tu puntuacion es de "+ p1.d1+" puntos");
				System.exit(0);
				MenuInicio.main (null); 
			}
			
		}
		private void rescatarObs() {
			if(bc!=null && bc.numTipo==7) {
				p1.d1++;
				p1.setPuntos();
			}else {
				matObs[j1.posMatY][j1.posMatX] = bc;
			}
		}
		public void Exterior(Jugador j1) {
			boolean sw = false;
			int obsE = getObstaculo(j1.posMatY,j1.posMatX+1);//obs Este
			int obsNE = getObstaculo(j1.posMatY-1,j1.posMatX+1);//obs noreste
			if(getObstaculo(j1.posMatY-1,j1.posMatX)==1 && j1.swSaltar) {//obsArriba
				colicionBandera = sw;
			} else if(obsNE==1 && j1.swSaltar) {
				colicionBandera = sw;
			}else if(obsE==1 || obsE==3 && !j1.swSaltar) {
				
				colicionBandera = sw;
			}else if(j1.posMatY<8) {
							  if(getObstaculo(j1.posMatY+1,j1.posMatX)==3 && !j1.swSaltar ) {
								  colicionBandera = sw;		
							}
			}
			if(obsE==4 || obsNE==4) {
				j1.swVolar = !j1.swVolar;
			}
			if(obsE==6) {
				j1.posMatY = 1;
				j1.y= 70;
			}
			}
private int getObstaculo(int x,int y) {
	if(matObs[x][y]!=null) {
	return matObs[x][y].numTipo;
	}else return 0;
}
public void guardarObstaculos(int x,int y) {
		bc = matObs[x][y];
}
}
