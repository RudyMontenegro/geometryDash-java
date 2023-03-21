package mapas;

import Mecanismo.ObjetoJuego;

public class mapa3 {
	private ObjetoJuego[][] obstaculosMapa1;
	private ObjetoJuego cubo;
    private ObjetoJuego espinaN;
    private ObjetoJuego espinaS;
    private ObjetoJuego espinaO;
    private ObjetoJuego volar;
    private ObjetoJuego semiPiso;
    private ObjetoJuego obsComun;
    private ObjetoJuego espinas;
    private ObjetoJuego espinasS;
    private ObjetoJuego jump;
    private ObjetoJuego tpUp;
    private ObjetoJuego punto;
    private ObjetoJuego winner;
    public ObjetoJuego[][] getMapa1(){
    	return obstaculosMapa1;
    }
	public mapa3() {
		obstaculosMapa1 = new ObjetoJuego[9][300];
		cubo = new ObjetoJuego("cubo");
		espinaN = new ObjetoJuego("espinaN");
		espinaS = new ObjetoJuego("espinaS");
		espinaO = new ObjetoJuego("espinaO");
		volar = new ObjetoJuego("volar");
		espinas = new ObjetoJuego("espinas");
		obsComun  = new ObjetoJuego("obsComun");
		semiPiso =new ObjetoJuego("semiPiso");
		jump = new ObjetoJuego("jump");
		espinasS = new ObjetoJuego("espinasS");
		tpUp = new ObjetoJuego("tpUp");
		punto =new ObjetoJuego("punto");
		winner = new ObjetoJuego("ganar");
		int temp =1;
 
		
for(int i=0; i<20;i++) {
		obstaculosMapa1[8][15+i] =  cubo; 
}
	
obstaculosMapa1[7][25] =  jump; 
obstaculosMapa1[5][27] =  jump; 
obstaculosMapa1[3][29] =  jump; 
}}

