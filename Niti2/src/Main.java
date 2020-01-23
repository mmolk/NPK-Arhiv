
public class Main {

	public static void main(String[] args) {
		
		Niti2 nit1 = new Niti2("Nit-1", 1500);
		nit1.setDaemon(false);
		nit1.start();
		
		//Daemon - ce je 'true' thread ni vezan na uporabnika
		Niti2 nit2 = new Niti2("Nit-2", 3000);
		nit2.setDaemon(true);
		nit2.start();
	
	}

}

