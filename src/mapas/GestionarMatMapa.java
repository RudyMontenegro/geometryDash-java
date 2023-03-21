package mapas;
import Mecanismo.ObjetoJuego;
public class GestionarMatMapa {

	public ObjetoJuego[][] getMapa(int numMapa) {
		 if(numMapa ==1) {
			 return new mapa1().getMapa1();
			 
		 }else if(numMapa ==2){
			 return new mapa2().getMapa1();
		 }else {
			 return new mapa3().getMapa1();
		 }
		// return null;
	}

}
