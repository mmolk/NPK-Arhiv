
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kolo bicikel = new Kolo("modra");
		
		System.out.println("Barva bicikla: " + bicikel.getBarvaKolesa() );
		
		bicikel.pospesi();
		bicikel.pospesi();
		bicikel.pospesi();
		
		System.out.println("Trenutna hitrost: " + bicikel.hitrost);
		
		Kolo bicikel2 = new Kolo("rumeno");
		System.out.println("Barva bicikla: " + bicikel2.getBarvaKolesa() );
		System.out.println("Trenutna hitrost: " + bicikel2.hitrost);
		bicikel.zaviraj();
		bicikel.setBarvo("rdeča");
		System.out.println("Barva bicikla: " + bicikel.getBarvaKolesa() );
		System.out.println("Trenutna hitrost: " + bicikel.hitrost);
		
		Kolo bicikel3 = new Kolo();
		System.out.println("Barva kolesa: " + bicikel3.getBarvaKolesa() );
		


	}
	

	

}
