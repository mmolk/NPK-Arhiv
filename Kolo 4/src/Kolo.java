
public abstract class Kolo {
	
	private String barva;
	protected int hitrost = 0;
	
	
	public Kolo(String barva, int hitrost) {
		this.barva = barva;
		this.hitrost = hitrost;
	}
	
	public void izpisiVseLastnoti() {
		System.out.println("Barva kolesa: " + this.barva);
		System.out.println("Trenutna hitrost: " + this.hitrost);
	}
	
	abstract void pospesi();
	
	abstract void zaviraj();

}
