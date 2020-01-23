
public class Main {

	public static void main(String[] args) {
		Niti1 prvaNit = new Niti1("Nit-1", 500);
		prvaNit.start();
		
		Niti1 drugaNit = new Niti1("Nit-2", 1500);
		drugaNit.start();
		
		Niti1 tretjaNit = new Niti1("Nit-3", 900);
		tretjaNit.start();

	}

}
