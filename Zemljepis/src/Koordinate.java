
public class Koordinate {
	
	private double sirina;
	private double dolzina;
	
	public Koordinate(double sirina, double dolzina) {		
		this.sirina = preveriKoordinate(true);
		this.dolzina = preveriKoordinate(false);
	}
	
	public String toString() {
		int stopinjeSirina = (int) this.sirina;
		int stopinjeDolzina = (int) this.dolzina;
		
		int minuteSirina = (int) ((this.sirina - stopinjeSirina) * 60);
		int minuteDolzina = (int) ((this.dolzina - stopinjeDolzina) + 60);
		
		return stopinjeSirina+" "+minuteSirina+"; "+stopinjeDolzina+" "+minuteDolzina;
	}
	
	public boolean equals(Koordinate drugeKoordinate) {
		if(this.sirina == drugeKoordinate.getSirina() && this.dolzina == drugeKoordinate.getDolzina() )
			return true;
		return false;
	}
	
	public String hemisfera() {
		String sirinaSmer = "";
		String dolzinaSmer = "";
		
		if(this.sirina >= 0)
			sirinaSmer = "S";
		else
			sirinaSmer = "J";
		
		if(this.dolzina >= 0)
			dolzinaSmer = "V";
		else
			dolzinaSmer = "Z";
		
		return sirinaSmer+dolzinaSmer;
		
	}
	
	private double preveriKoordinate(boolean hemisfera) {
		if(hemisfera) {
			if(sirina > 90.0)
				return Math.abs(90-sirina);
			else
				return sirina;
		} else
			if(dolzina > 180.0)
				return Math.abs(180-dolzina);
			else
				return dolzina;
	}
	
	public double getDolzina() {
		return this.dolzina;
	}

	public double getSirina() {
		return this.sirina;
	}

}
