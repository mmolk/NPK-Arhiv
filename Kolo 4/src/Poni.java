
public class Poni extends Kolo implements PrevoznoSredstvo{

	public Poni(String barva, int hitrost) {
		super(barva, hitrost);
	}

	@Override
	void pospesi() {
		super.hitrost++;		
	}

	@Override
	void zaviraj() {		
		super.hitrost--;
	}

	@Override
	public boolean sePremika() {
		if(super.hitrost > 0)
			return true;		
		return false;
	}

}
