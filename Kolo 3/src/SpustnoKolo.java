
public class SpustnoKolo extends GorskoKolo{
	
	private double teza;

	public SpustnoKolo(String barva, int maxHitrost, double teza) {
		super(barva, maxHitrost);
		this.teza = teza;
	}
	
	public void pospesi() {
		super.hitrost += (int)(1 * this.teza);
	}
	
	public void zaviraj() {
		super.zaviraj();
	}
	
	public void izpisiVseLastnosti() {
		System.out.println("LASTNOSTI - SPTUSTNO KOLO: ");
		super.izpisiVseLastnosti();
		System.out.println("Teza kolesa: " + this.teza);
	}
}
