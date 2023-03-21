package Mecanismo;

public class gestionAudio {
	private Audio a1;
	public gestionAudio(int numSonido) {
		Audio auid = new Audio();
		auid.x=numSonido;
		auid.start();
		a1 = auid;
	}
	public void para() {
		a1.stop();
	}

}
