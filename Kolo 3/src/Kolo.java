
public class Kolo {
	
	private String barva;
	protected int hitrost = 0;
	protected final int MAX_HITROST;
	
	public static int steviloNarejenihKoles = 0;
	
	public Kolo(String barva) {
		this.barva = barva;
		this.MAX_HITROST = 50;
		
		steviloNarejenihKoles++;
	}
	
	public Kolo(String barva, int maxHitrost) {
		this.barva = barva;
		this.MAX_HITROST = maxHitrost;
		
		steviloNarejenihKoles++;
	}
	
	public String getBarva() {
		return this.barva;
	}
	
	public void zaviraj() {
		if(this.hitrost > 0)
			this.hitrost--;
	}
	
	public void pospesi() {
		if(this.lahkoPospesi() )
			this.hitrost++;
	}

	private boolean lahkoPospesi() {
		int novaHitrost = this.hitrost + 1;
		return novaHitrost <= this.MAX_HITROST;
	}
	
	public void izpisiVseLastnosti() {
		System.out.println("Barva kolesa: " + this.barva);
		System.out.println("Trenutna hitrost: " + this.hitrost);
		System.out.println("Top speed: " + this.MAX_HITROST);
	}
	

}
