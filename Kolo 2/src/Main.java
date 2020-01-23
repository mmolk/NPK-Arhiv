
public class Main {

	public static void main(String[] args) {
		
		Kolo prvoKolo = new Kolo("bela");
		
		prvoKolo.pospesi();
		prvoKolo.pospesi();
		prvoKolo.pospesi();
		
		prvoKolo.getVseLastnosti();
		
		Kolo drugoKolo = new Kolo("modra", 3);
		drugoKolo.pospesi();
		drugoKolo.pospesi();
		drugoKolo.pospesi();
		drugoKolo.pospesi();
		
		drugoKolo.getVseLastnosti();
		
		System.out.println("Število koles: " + Kolo.steviloNarejenihKoles);
		
		Kolo tretjeKolo = new Kolo("modra", 3);
		tretjeKolo.pospesi();
		tretjeKolo.pospesi();
		tretjeKolo.pospesi();
		
		if(prvoKolo.equals(tretjeKolo)) {
			System.out.println("Kolesi sta enaki!");
		} else {
			System.out.println("Kolesi nista enaki!!!!");
		}
		
		
	}

}
