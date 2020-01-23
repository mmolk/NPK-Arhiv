import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Lopar {

	private static final int Y = 330;
	private static final int SIRINA = 250;
	private static final int VISINA = 20;
	private int x = 0;
	private int xPremik = 0;
	private Igra igra;
	
	//KONSTRUKTOR (sprejme objekt tipa igra)
	public Lopar(Igra igra) {
		this.igra = igra;
	}
	
	//Metoda za premikanje:
	public void premakni() {
		if(this.x + this.xPremik > 0 && this.x + this.xPremik < igra.getWidth() - SIRINA) // premika, dokler ne takne roba okvirja (igra.getWidth)
			this.x += this.xPremik;
	}
	
	// Izris loparja
	public void paint(Graphics2D g) {
		g.setColor(Color.BLACK);
		g.fillRect(this.x, Y, SIRINA, VISINA);
	}

	// Metoda, ko je tipka spuscena:
	public void tipkaSpuscena(KeyEvent e) {
		this.xPremik = 0;
	}

	// Metoda, ko je tipka pritisnjena:
	public void tipkaPritisnjena(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_LEFT) // Leva tipka
			this.xPremik = -igra.hitrost;
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) // Desna tipka
			this.xPremik = igra.hitrost;
	}
	
	public Rectangle getMejeLoparja() {
		return new Rectangle(this.x, Y,  SIRINA, VISINA);
	}

}
