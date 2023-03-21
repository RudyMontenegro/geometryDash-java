package mapas;
import Mecanismo.ObjetoJuego;
public class mapa1{
	private ObjetoJuego[][] obstaculosMapa1;
	private ObjetoJuego cubo;
    private ObjetoJuego espinaN;
    private ObjetoJuego EspinaS;
    private ObjetoJuego EspinaO;
    private ObjetoJuego ObsVolar;
    private ObjetoJuego semiPiso;
    private ObjetoJuego obsComun;
    private ObjetoJuego espinas;
    private ObjetoJuego espinasS;
    private ObjetoJuego punto;
    private ObjetoJuego winner;
    public ObjetoJuego[][] getMapa1(){
    	return obstaculosMapa1;
    }
	public mapa1() {
		obstaculosMapa1 = new ObjetoJuego[9][300];
		cubo = new ObjetoJuego("obsComun");
		espinaN = new ObjetoJuego("espinaN");
		EspinaS = new ObjetoJuego("espinaS");
		EspinaO = new ObjetoJuego("espinaO");
		ObsVolar = new ObjetoJuego("volar");
		espinas = new ObjetoJuego("espinas");
		obsComun  = new ObjetoJuego("obsComun");
		semiPiso =new ObjetoJuego("semiPiso");
		espinasS = new ObjetoJuego("espinasS");
		punto = new ObjetoJuego("punto");
		winner = new ObjetoJuego("ganar");
		//INICIO SET 1 FILA 8
		obstaculosMapa1[8][23] =  cubo;//inicio ecena 1
     	obstaculosMapa1[8][24] =  cubo;
     	obstaculosMapa1[8][25] =  espinaN;
     	obstaculosMapa1[8][26] =  espinaN;
     	obstaculosMapa1[8][27] =  espinaN;
     	obstaculosMapa1[8][28] =  cubo;//S
     	obstaculosMapa1[8][33] =  cubo;
     	obstaculosMapa1[8][34] =  cubo;
     	obstaculosMapa1[8][35] =  cubo; 
     	obstaculosMapa1[8][36] =  cubo; 
     	obstaculosMapa1[8][37] =  cubo; 
     	obstaculosMapa1[8][38] =  cubo; 
     	obstaculosMapa1[8][37] =  cubo; 
     	obstaculosMapa1[8][39] =  cubo;  
     	
     	obstaculosMapa1[8][40] =  espinaN;
     	obstaculosMapa1[8][41] =  espinaN;//s2
     	obstaculosMapa1[8][44] =  espinaN;
     	obstaculosMapa1[8][45] =  espinaN;
     	
     	obstaculosMapa1[8][46] =  cubo;  
     	// FILA 7
      
     	obstaculosMapa1[7][37] =  cubo; 
     	obstaculosMapa1[7][38] =  cubo; 
     	obstaculosMapa1[7][39] =  cubo; //S
     	obstaculosMapa1[7][42] =  cubo; 
     	obstaculosMapa1[7][43] =  cubo; //S
     	obstaculosMapa1[7][46] =  cubo; 
     	obstaculosMapa1[6][39] =  punto;
        // SET 2
     	//FILA 8
     	obstaculosMapa1[8][51] =  espinaN;//SS
     	obstaculosMapa1[8][56] =  espinaN;
     	obstaculosMapa1[8][57] =  espinaN;//S
     	obstaculosMapa1[8][61] =  cubo;
     	obstaculosMapa1[8][62] =  cubo;
     	obstaculosMapa1[8][63] =  espinaN;//ss
     	obstaculosMapa1[8][71] =  espinaN;
     	obstaculosMapa1[8][72] =  espinaN;
     	obstaculosMapa1[8][73] =  espinaN;
     	//FILA 7
     	obstaculosMapa1[8][47] =  cubo;//SS
     	obstaculosMapa1[7][64] =  cubo;
     	obstaculosMapa1[7][65] =  cubo;//SS
     	obstaculosMapa1[7][80] =  EspinaS;
     	obstaculosMapa1[7][81] =  EspinaS;
     	obstaculosMapa1[7][82] =  EspinaS;
     	obstaculosMapa1[7][83] =  EspinaS;
     	obstaculosMapa1[7][84] =  EspinaS;
     	obstaculosMapa1[7][85] =  EspinaS;
     	obstaculosMapa1[7][86] =  EspinaS;
     	obstaculosMapa1[7][87] =  EspinaS;
     	obstaculosMapa1[7][88] =  EspinaS;
     	obstaculosMapa1[7][89] =  EspinaS;
     	obstaculosMapa1[7][90] =  EspinaS;
     	obstaculosMapa1[7][91] =  EspinaS;
     	obstaculosMapa1[7][92] =  EspinaS;
     	obstaculosMapa1[7][93] =  EspinaS;
     	//FILA 6
     	obstaculosMapa1[6][66] =  espinaN;
     	obstaculosMapa1[6][67] =  cubo;
     	obstaculosMapa1[6][68] =  cubo;//SS
     	for(int i=1;i<15;i++) {
     		obstaculosMapa1[6][79+i] =  cubo;
     	}
     	//FILA 5
     	//obstaculosMapa1[5][69] =  ObsCuadrado;
     	obstaculosMapa1[5][70] =  cubo;//SS
     	obstaculosMapa1[4][70] =  punto;//----------------------------------------
     	obstaculosMapa1[5][74] =  cubo;
     	obstaculosMapa1[5][75] =  cubo;//SS
     	obstaculosMapa1[5][80] =  punto;//-----------------
     	obstaculosMapa1[5][86] =  espinaN;
     	obstaculosMapa1[5][91] =  espinaN;
     	obstaculosMapa1[5][92] =  espinaN;
     	//obstaculosMapa1[5][93] =  ObsEspina;
     	//SET 3
     	//FILA 8
     	obstaculosMapa1[8][105] =  espinaN;
     	obstaculosMapa1[8][106] =  espinaN;//SS
     	obstaculosMapa1[8][112] =  cubo;
     	obstaculosMapa1[8][113] =  cubo;//SS
     	obstaculosMapa1[8][114] =  espinaN;
     	obstaculosMapa1[8][115] =  cubo;
     	obstaculosMapa1[8][116] =  cubo;//SS
     	obstaculosMapa1[8][117] =  espinaN;
     	obstaculosMapa1[8][118] =  cubo;
     	obstaculosMapa1[8][119] =  cubo;//SS
     	obstaculosMapa1[8][120] =  espinaN;
     	obstaculosMapa1[8][121] =  cubo;
     	obstaculosMapa1[8][122] =  cubo;
     	for(int i=1;i<11;i++) {
     		obstaculosMapa1[8][122+i] = espinas;
     	}
     	//FILA 7
     	for(int i=1;i<7;i++) {
     		obstaculosMapa1[7][93+i] =  cubo;
     	}//SS
     	obstaculosMapa1[7][115] =  cubo;
     	obstaculosMapa1[7][116] =  cubo;//SS
     	obstaculosMapa1[7][118] =  cubo;
     	obstaculosMapa1[7][119] =  cubo;//SS
     	obstaculosMapa1[7][121] =  cubo;
     	obstaculosMapa1[7][122] =  cubo;//SS
     	obstaculosMapa1[7][133] =  cubo;
     	obstaculosMapa1[7][134] =  cubo;
     	obstaculosMapa1[7][135] =  cubo;
     	obstaculosMapa1[7][136] =  cubo;
     	obstaculosMapa1[7][137] =  cubo;
     	//FILA 6
     	obstaculosMapa1[6][99] =  espinaN;//SS
     	obstaculosMapa1[6][118] =  cubo;
     	obstaculosMapa1[6][119] =  cubo;//SS
     	obstaculosMapa1[6][121] =  cubo;
     	obstaculosMapa1[6][122] =  cubo;//SS
     	obstaculosMapa1[6][129] =  cubo;
     	obstaculosMapa1[6][130] =  cubo;
     	obstaculosMapa1[6][131] =  cubo;//SS
     	obstaculosMapa1[6][132] =  cubo;
     	obstaculosMapa1[6][137] =  espinaN;
     	//FILA 5
     	obstaculosMapa1[5][121] =  cubo;
     	obstaculosMapa1[5][122] =  cubo;//
     	obstaculosMapa1[5][125] =  cubo;
     	obstaculosMapa1[5][126] =  cubo;
     	obstaculosMapa1[5][127] =  cubo;
     	obstaculosMapa1[5][132] =  espinaN;
        //FILA 4
     	obstaculosMapa1[4][127] =  espinaN;
    
     	//SET 4 FILA 8
     	obstaculosMapa1[4][122] =  punto;
		obstaculosMapa1[8][149] =  semiPiso;
     	obstaculosMapa1[8][150] =  semiPiso;
     	obstaculosMapa1[8][151] =   espinas;
     	obstaculosMapa1[8][152] =   espinas;
     	obstaculosMapa1[8][153] =   espinas;
     	obstaculosMapa1[8][154] =   espinas;
     	obstaculosMapa1[8][155] =  espinas;
     	obstaculosMapa1[8][156] =   espinas;
     	obstaculosMapa1[8][157] =  espinas;
     	obstaculosMapa1[8][158] =   espinas;
     	obstaculosMapa1[8][159] =  espinaN;
     	for(int i=1;i<9;i++) {
     		obstaculosMapa1[8][159+i] =  obsComun;
     	}
     	//FILA 7
     	obstaculosMapa1[7][144] =  EspinaO;
     	obstaculosMapa1[7][145] =  obsComun;//SS
     	obstaculosMapa1[7][152] =  semiPiso;
     	obstaculosMapa1[7][153] =  semiPiso;
     	for(int i=1;i<9;i++) {
     		obstaculosMapa1[7][159+i] =  obsComun;
     	}
     	
     	for(int i=1;i<8;i++) {
     		obstaculosMapa1[7][171+i] =EspinaS;
     	}
     	obstaculosMapa1[7][180] = ObsVolar;
     	//FILA 6
     	obstaculosMapa1[6][144] =  EspinaO;
     	obstaculosMapa1[6][145] =  obsComun;
     	obstaculosMapa1[6][155] =  semiPiso;
     	obstaculosMapa1[6][156] =  semiPiso;
     	for(int i=1;i<9;i++) {
     		obstaculosMapa1[6][159+i] =  obsComun;
     	}
     	for(int i=1;i<8;i++) {
     		obstaculosMapa1[6][171+i] =obsComun;
     	}
     		//FILA 5
     		for(int i=1;i<6;i++) {
         		obstaculosMapa1[5][158+i] =  obsComun;
         	}	
     		for(int i=1;i<5;i++) {
         		obstaculosMapa1[5][174+i] =  obsComun;
         	}	
     		//FILA 4
     		obstaculosMapa1[4][177] =  obsComun;
     		obstaculosMapa1[4][177] =  obsComun;
     		//FILA 3
     		for(int i=1;i<8;i++) {
         		obstaculosMapa1[3][164+i] =  obsComun;
         	}	
     		//FILA 2
     		for(int i=1;i<8;i++) {
         		obstaculosMapa1[3][164+i] =  obsComun;
         	}	
     		//SET 5-----------------------------------
     		for(int i=1;i<22;i++) {
         		obstaculosMapa1[8][191+i] =  obsComun;
         	}	
     		//FILA 7
     		for(int i=1;i<6;i++) {
         		obstaculosMapa1[7][192+i] =  obsComun;
     		}
     		obstaculosMapa1[7][207] =  espinaN;
     		obstaculosMapa1[7][208] =  obsComun;
     		obstaculosMapa1[7][209] =  obsComun;
     		obstaculosMapa1[7][210] =  obsComun;
     		obstaculosMapa1[7][211] =  espinaN;
     		obstaculosMapa1[7][220] =  obsComun;
     		obstaculosMapa1[7][234] =  obsComun;
     		//FILA 6
     		obstaculosMapa1[6][194] =  obsComun;
     		obstaculosMapa1[6][195] =  obsComun;
     		obstaculosMapa1[6][196] =  obsComun;
     		obstaculosMapa1[6][208] =  espinaN;
     		obstaculosMapa1[6][209] =  obsComun;
     		obstaculosMapa1[6][210] =  espinaN;
     		//FILA 5
     		obstaculosMapa1[5][195] =  obsComun;
     		obstaculosMapa1[5][209] =  espinaN;
     		obstaculosMapa1[5][227] =  obsComun;
     		//FILA 3
     		obstaculosMapa1[3][224] =  obsComun;
     		//FILA 2 
     		obstaculosMapa1[2][219] =  obsComun;
     		obstaculosMapa1[2][230] =  obsComun;
     		//FILA1
     		obstaculosMapa1[1][238] =  obsComun;
     		//FILA 0
     		for(int i=1;i<31;i++) {
         		obstaculosMapa1[0][187+i] =espinasS;
     		}
     		//SET 6 ---------------------------------
     		for(int i=1;i<13;i++) {
         		obstaculosMapa1[7][241+i] =espinasS;
     		}
     		obstaculosMapa1[7][255] = ObsVolar;
     		//FILA 6
     		for(int i=1;i<14;i++) {
         		obstaculosMapa1[6][240+i] =obsComun;
     		}
     		//FILA 5
     		for(int i=1;i<15;i++) {
         		obstaculosMapa1[5][239+i] =obsComun;
     		}
     		//FILA 4
     		for(int i=1;i<16;i++) {
         		obstaculosMapa1[4][238+i] =obsComun;
     		}
     		for(int i=1;i<17;i++) {
         		obstaculosMapa1[3][237+i] =obsComun;
     		}
     		for(int i=1;i<18;i++) {
         		obstaculosMapa1[2][236+i] =obsComun;
     		}
     		for(int i=1;i<19;i++) {
         		obstaculosMapa1[1][235+i] =obsComun;
     		}
     		for(int i=1;i<20;i++) {
         		obstaculosMapa1[0][234+i] =obsComun;
     		}
     		//FILA 8-------------
     		obstaculosMapa1[8][260] =  winner; 
	}
	}

