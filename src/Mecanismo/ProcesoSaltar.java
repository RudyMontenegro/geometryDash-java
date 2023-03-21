package Mecanismo;


public class ProcesoSaltar extends Thread{
	private Jugador j1Saltar;

	public ProcesoSaltar(String mgs,Jugador j1) {
		super(mgs);
		j1Saltar = j1;

	}
	
public void run(){
	while(true) {
	   j1Saltar.saltar();
	}

}
}
 


class ProcesoCaer extends Thread{
	private Jugador j1Saltar;
	public ProcesoCaer(String mgs,Jugador j1) {
		super(mgs);
		j1Saltar = j1;
	}
public void run(){
	while(true) {
	   j1Saltar.Caer();
	}

}
}
