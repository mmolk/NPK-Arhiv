
public class Kolo {
	
	private String barva;
	public int hitrost = 0;
	
	public Kolo() {
		this.barva = "Kolo ni pobarvano!";
	}
	
	public Kolo(String barva) {
		this.barva = barva;
	}
	
	public void pospesi() {
		this.hitrost++;
	}
	
	public void zaviraj() {
		if(this.hitrost > 0)
			this.hitrost--;
	}
	
	public String getBarvaKolesa() {
		return this.barva;
	}
	
	public void setBarvo(String novaBarva) {
		this.barva = novaBarva; 
	}

}
