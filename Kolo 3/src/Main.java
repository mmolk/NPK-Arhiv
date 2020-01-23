
public class Main {

	public static void main(String[] args) {
		
		Kolo bicikel = new Kolo("Zelena");
		
		bicikel.izpisiVseLastnosti();
		
		CestnoKolo cestnoKolo = new CestnoKolo("modra", 120, 15);
		
		cestnoKolo.pospesi();
		cestnoKolo.visajBrzino();
		cestnoKolo.pospesi();
				
		System.out.println("");
		cestnoKolo.izpisiVseLastnosti();
		
		System.out.println("");
		
		SpustnoKolo downHill = new SpustnoKolo("bela", 100, 4.6);
		downHill.pospesi();
		downHill.pospesi();
		downHill.pospesi();
		downHill.zaviraj();
		
		downHill.izpisiVseLastnosti();

	}

}
