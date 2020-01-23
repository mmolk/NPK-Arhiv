import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JOptionPane;

public class Zoga {
	
	private static final int PREMER = 30;
	public int x = 0;
	public int y = 0;
	public int xPremik = 1;
	public int yPremik = 1;
	private Igra igra;
	
	public Zoga(Igra igra) {
		this.igra = igra;
	}
	
	// Izris zoge:
	public void paint(Graphics2D g) {
		g.setColor(Color.BLUE);
		g.fillOval(x, y, PREMER, PREMER);
	}
	
	// Metoda - premikanje zoge.
	public void premakni() {
		if(x + this.xPremik < 0) 
			xPremik = igra.hitrost;
		
		if(x + this.xPremik > igra.getWidth() - PREMER) 
			xPremik = -igra.hitrost;
		
		// Pogoj ce se dotakne spodnjega roba:
		if(y + this.yPremik > igra.getHeight() - PREMER) 
			igra.gameOver();
		
		if(y + this.yPremik < 0) 
			yPremik = igra.hitrost;
		
		// Zoga se odbije, ce pride do trka:
		// Ko pride do trka, se poveca hitrost zoge in loparja:
		if(trk()) {
			yPremik = -1;
			igra.hitrost++;
		}
		
		x += xPremik;
		y += yPremik;
	}
	

	public Rectangle getMejeZoge() {
		return new Rectangle(this.x, this.y, PREMER, PREMER);
	}
	
	// Metoda, ki preveri, ce se lopar in zoga krizajo:
	public boolean trk() {
		// Lahko klicemo lopar.getMejeLoparja, ker objekt zoga v razredu Igra dostopa
		// do metod objekta lopar, ki je definiran v Igra
		return igra.lopar.getMejeLoparja().intersects(this.getMejeZoge());
	}
	

}
