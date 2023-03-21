package mapas;

import Mecanismo.ObjetoJuego;

public class mapa2{
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
    private ObjetoJuego winner;
    private ObjetoJuego punto;
    public ObjetoJuego[][] getMapa1(){
    	return obstaculosMapa1;
    }
	public mapa2() {
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
		winner = new ObjetoJuego("ganar");
		punto = new ObjetoJuego("punto");
     	//SET 1 -------------------------------
		//FILA 8
     	for(int i=1; i<20;i++) {
     		obstaculosMapa1[8][12+i] =  obsComun; 
     	}
     	for(int i=1; i<16;i+=2) {
     		obstaculosMapa1[8][31+i] =  espinas;
     	}
     	//Fila 7
     	obstaculosMapa1[7][17] =  jump; 
     	obstaculosMapa1[7][18] =  espinaN;
     	obstaculosMapa1[7][23] =  jump; 
     	obstaculosMapa1[7][24] =  espinas;//SSS
     	
     	//FILA 6
     	obstaculosMapa1[6][30] =  volar; 
     	obstaculosMapa1[6][40] =  punto;
     	//FILA 4 
     	obstaculosMapa1[4][13] =  espinasS;
     	obstaculosMapa1[4][15] =  espinasS;
     	obstaculosMapa1[4][21] =  espinasS;
     	obstaculosMapa1[4][27] =  espinasS;
     	//fila 3,2,1,0
     	for(int i=1; i<20;i++) {
     		obstaculosMapa1[3][12+i] =  obsComun; 
     	}
     	for(int i=1; i<20;i++) {
     		obstaculosMapa1[2][12+i] =  obsComun; 
     	}
     	for(int i=1; i<17;i++) {
     		obstaculosMapa1[1][31+i] =  cubo; 
     	}
     	for(int i=1; i<20;i++) {
     		obstaculosMapa1[1][12+i] =  obsComun; 
     	}
     	for(int i=1; i<20;i++) {
     		obstaculosMapa1[0][12+i] =  obsComun; 
     	}
     	for(int i=1; i<17;i++) {
     		obstaculosMapa1[0][31+i] =  cubo; 
     	}
     	//SET 2---------------------------------
     	//FILA 8
     	for(int i=1; i<12;i+=2) {
     		obstaculosMapa1[8][47+i] = espinas; 
     	}
     	obstaculosMapa1[8][63] =  jump; 
     	obstaculosMapa1[8][65] =  espinas;//SSS
     	obstaculosMapa1[8][71] =  espinas;
     	obstaculosMapa1[8][73] =  espinas;
     	obstaculosMapa1[8][76] =  obsComun;
     	obstaculosMapa1[8][77] =  obsComun;
     	obstaculosMapa1[8][78] =  obsComun;
     	obstaculosMapa1[8][79] =  obsComun; 
     	obstaculosMapa1[8][80] =  obsComun; 
     	obstaculosMapa1[8][81] =  obsComun; 
     	obstaculosMapa1[8][82] =  espinas;
     	obstaculosMapa1[8][84] =  espinas;
     	obstaculosMapa1[8][86] =  espinas;
     	obstaculosMapa1[8][88] =  obsComun;
     	obstaculosMapa1[8][94] =  espinaN;
     	obstaculosMapa1[8][95] =  espinaN;
        //FILA 7
     	for(int i=1; i<10;i++) {
     		obstaculosMapa1[7][49+i] =  obsComun; 
     	}
     	 
     	obstaculosMapa1[7][81] =  obsComun; 
     	obstaculosMapa1[7][88] =  obsComun; 
     	//fila 6
     	obstaculosMapa1[6][72] =  jump; 
	    obstaculosMapa1[6][61] =  semiPiso;
	    obstaculosMapa1[6][62] =  semiPiso;
	    obstaculosMapa1[6][63] =  semiPiso;
	    obstaculosMapa1[6][64] =  obsComun; 
     	obstaculosMapa1[6][65] =  obsComun;
     	obstaculosMapa1[6][55] =  punto;
     	//FILA 5
     	obstaculosMapa1[5][54] =  obsComun; 
     	obstaculosMapa1[5][55] =  obsComun; 
	    obstaculosMapa1[5][56] =  obsComun; 
	 	obstaculosMapa1[5][58] =  volar; 
	 	obstaculosMapa1[5][85] =  jump;
	 	//FILA 4
	 	for(int i=1; i<6;i++) {
     		obstaculosMapa1[4][62+i] =  obsComun; 
     	}
	 	//FILA 3
	 	obstaculosMapa1[3][57] =  espinasS;
	 	for(int i=1; i<9;i++) {
     		obstaculosMapa1[3][60+i] =  obsComun; 
     	}//FILA 2
	 	for(int i=1; i<12;i++) {
     		obstaculosMapa1[2][47+i] =  obsComun; 
     	}
	 	for(int i=1; i<11;i++) {
     		obstaculosMapa1[2][59+i] =  obsComun; 
     	}
	 	//FILA 1
	 	for(int i=1; i<12;i++) {
     		obstaculosMapa1[1][47+i] =  obsComun; 
     	}
	 	for(int i=1; i<13;i++) {
     		obstaculosMapa1[1][58+i] =  obsComun; 
     	}
	 	// FILA 0
	 	for(int i=1; i<12;i++) {
     		obstaculosMapa1[0][47+i] =  obsComun; 
     	}
	 	for(int i=1; i<15;i++) {
     		obstaculosMapa1[0][57+i] =  obsComun; 
     	}
	 	// SET 3--------------------------------
	 	//FILA 8
	 	//obstaculosMapa1[8][97] =  tpUp; 
	 	obstaculosMapa1[8][98] =  tpUp; 
	 	for(int i=1; i<9;i++) {
     		obstaculosMapa1[8][99+i] =  obsComun; 
     	}
	 	obstaculosMapa1[8][107] =  espinaN; 
	 	for(int i=1; i<5;i++) {
     		obstaculosMapa1[8][111+i] =  obsComun; 
     	}
	 	obstaculosMapa1[8][125] =  espinaN; 
	 	obstaculosMapa1[8][126] =  espinaN; 
	 	obstaculosMapa1[8][127] =  obsComun; 
	 	obstaculosMapa1[8][128] =  espinas; 
	 	obstaculosMapa1[8][130] =  obsComun;
	 	obstaculosMapa1[8][131] =  espinas; 
	 	obstaculosMapa1[8][133] =  espinaN; 
	 	obstaculosMapa1[8][134] =  obsComun;
	 	obstaculosMapa1[8][139] =  espinaN; 
	 //	obstaculosMapa1[8][142] =  espinaN; 
	 	//FILA 7
	 	for(int i=1; i<9;i++) {
     		obstaculosMapa1[7][98+i] =  obsComun; 
     	}
	 	obstaculosMapa1[7][114] =  espinas; 
	 	//obstaculosMapa1[7][119] =  obsComun; 
	 	obstaculosMapa1[7][130] =  obsComun; 
	 	//FILA 6
	 	for(int i=1; i<9;i++) {
     		obstaculosMapa1[6][98+i] =  obsComun; 
     	}
	 	obstaculosMapa1[6][108] =  semiPiso; 
	 	obstaculosMapa1[6][109] =  semiPiso; 
	 	obstaculosMapa1[6][119] =  obsComun;
	 	obstaculosMapa1[6][130] =  punto;
	 	//FILA 5
	 	for(int i=1; i<9;i++) {
     		obstaculosMapa1[5][98+i] =  obsComun; 
     	}
	 	obstaculosMapa1[5][119] =  obsComun; 
	 	//fila 4
	 	for(int i=1; i<7;i++) {
     		obstaculosMapa1[4][98+i] =  obsComun; 
     	}
	 	obstaculosMapa1[4][112] =  semiPiso; 
	 	obstaculosMapa1[4][113] =  semiPiso; 
	 	obstaculosMapa1[4][114] =  semiPiso;
	 	for(int i=1; i<9;i++) {
     		obstaculosMapa1[4][114+i] =  obsComun; //----------------
     	}
	 	//FILA 3
	 	for(int i=1; i<6;i++) {
	 		obstaculosMapa1[3][96+i] =  obsComun; 
     	}
	 	obstaculosMapa1[3][117] =  punto;
	 	obstaculosMapa1[3][107] =  obsComun;
	 	obstaculosMapa1[3][108] =  obsComun;
	 	obstaculosMapa1[3][115] =  espinaN;
	 	obstaculosMapa1[3][120] =  espinaN;
	 	//FILA 2
	 	//for(int i=1; i<4;i++) {
	 		//obstaculosMapa1[2][98+i] =  obsComun; 
     	//}
	 	obstaculosMapa1[2][107] =  obsComun;
	 	obstaculosMapa1[2][108] =  obsComun;
	 	//FILA 1
	 	for(int i=1; i<6;i++) {
	 		obstaculosMapa1[1][103+i] =  obsComun; 
     	}
	 	obstaculosMapa1[1][117] =  espinaS; 
	 	obstaculosMapa1[1][123] =  espinas; 
	 	//FILA 0
	 	for(int i=1; i<40;i++) {
	 		obstaculosMapa1[0][103+i] =  obsComun; 
     	}
	 	//SET 4------------------------------------------------
	 	//FILA 8
	 	obstaculosMapa1[8][144] =  obsComun;
	 	obstaculosMapa1[8][145] =  obsComun;
	 	obstaculosMapa1[8][146] =  obsComun;
	 	obstaculosMapa1[8][147] =  obsComun;
	 	obstaculosMapa1[8][148] =  espinaN;
	 	obstaculosMapa1[8][149] =  obsComun;
	 	obstaculosMapa1[8][150] =  obsComun;
	 	obstaculosMapa1[8][151] =  espinaN;
	 	for(int i=1;i<11;i+=2) {
	 		obstaculosMapa1[8][151+i] =  espinas;
	 	}
	 	obstaculosMapa1[8][166] =  espinaN;
	 	obstaculosMapa1[8][180] =  obsComun;
	 	obstaculosMapa1[8][184] =  obsComun;
	 	obstaculosMapa1[8][185] =  obsComun;
	 	//FILA 7
	 	obstaculosMapa1[7][147] =  obsComun;
	 	obstaculosMapa1[7][148] =  obsComun;
	 	obstaculosMapa1[7][149] =  obsComun;
	 	obstaculosMapa1[7][150] =  obsComun;
	    //FILA 6
	 	//obstaculosMapa1[6][149] =  obsComun;
	 	obstaculosMapa1[6][150] =  obsComun;//SSS
	 	obstaculosMapa1[6][154] =  obsComun;
	 	obstaculosMapa1[6][158] =  obsComun;
	 	obstaculosMapa1[5][158] =  punto;
	 	for(int i=1; i<5;i++) {
	 		obstaculosMapa1[6][161+i] =  obsComun; 
     	}
	 	obstaculosMapa1[6][168] =  obsComun;
	 	for(int i=1; i<7;i++) {
	 		obstaculosMapa1[6][170+i] =  obsComun; 
     	}	//FILA 5

	  // obstaculosMapa1[5][178] =  obsComun; 
	//   obstaculosMapa1[5][180] =  espinaS; 
	   obstaculosMapa1[5][184] =  espinaS; 
	   obstaculosMapa1[5][185] =  espinaS; 
	   obstaculosMapa1[5][190] =  espinaS; 
	   obstaculosMapa1[5][173] =  punto;
	   //FILA 4
	   obstaculosMapa1[4][180] =  obsComun;
	 	obstaculosMapa1[4][184] =  obsComun;//SSS
	 	obstaculosMapa1[4][185] =  obsComun;
	 	obstaculosMapa1[4][187] =  obsComun;
	 	obstaculosMapa1[4][190] =  obsComun;
          //s¿SET 5------------------------
	 	//FILA 8
	 	obstaculosMapa1[8][193] =  obsComun; 
	    obstaculosMapa1[8][194] =  obsComun; 
	    for(int i=1;i<16;i+=2) {
	 		obstaculosMapa1[8][194+i] =  espinas;
	 	}//-----------------------------------------ESCALERA
	 	obstaculosMapa1[7][194] =  jump; 
	    obstaculosMapa1[5][196] =  jump; 
	    obstaculosMapa1[3][198] =  jump; 
	    //----------------------------------------------------
	    for(int i=1; i<10;i++) {
	 		obstaculosMapa1[8][211+i] =  obsComun; 
     	}
	    obstaculosMapa1[8][221] =  espinaN; 
	    obstaculosMapa1[8][223] =  espinaN; 
	    obstaculosMapa1[8][227] =  tpUp; 
	    obstaculosMapa1[8][229] =  espinaN; 
	    obstaculosMapa1[8][230] =  espinaN; 
	    //FILA 7
	    obstaculosMapa1[7][212] =  obsComun; 
	    obstaculosMapa1[7][213] =  obsComun; 
	    obstaculosMapa1[7][223] =  semiPiso; 
	    obstaculosMapa1[7][224] =  semiPiso;
	    //FILA 6 
	    obstaculosMapa1[6][212] =  obsComun; 
	    obstaculosMapa1[6][213] =  obsComun;
	    // FILA 4
	    for(int i=0; i<6;i++) {
			obstaculosMapa1[4][200+i] =  semiPiso; 
	}
	    obstaculosMapa1[4][205] =  semiPiso; 
	    obstaculosMapa1[4][206] =  semiPiso;//SS
	    obstaculosMapa1[3][206] =  punto;
	    obstaculosMapa1[4][208] =  semiPiso; 
	    obstaculosMapa1[4][209] =  semiPiso;
	    obstaculosMapa1[4][235] =  obsComun; 
	    obstaculosMapa1[4][236] =  obsComun;
	    // FILA 3
	    for(int i=1; i<8;i++) {
	 		obstaculosMapa1[3][227+i] =  obsComun; 
     	}
	    //SET 6----------------------------------------
	    //FILA 8
	    for(int i=1; i<11;i++) {
	 		obstaculosMapa1[8][241+i] =  obsComun; 
	    }//FILA 7
	    for(int i=1; i<9;i++) {
	 		obstaculosMapa1[7][243+i] =  obsComun; 
	    }
	    //FILA 6
	    for(int i=1; i<7;i++) {
	 		obstaculosMapa1[6][245+i] =  obsComun; 
	    }
	    for(int i=1; i<5;i++) {
	 		obstaculosMapa1[5][247+i] =  obsComun; 
	    }
	    for(int i=1; i<3;i++) {
	 		obstaculosMapa1[4][249+i] =  obsComun; 
	    }
	    //FILA 1
	    for(int i=1; i<48;i++) {
	 		obstaculosMapa1[1][239+i] =  obsComun; 
	    }
	    for(int i=1; i<48;i++) {
	 		obstaculosMapa1[0][239+i] =  obsComun; 
	    }
	    obstaculosMapa1[8][260] =  winner; 
	}
	
}
