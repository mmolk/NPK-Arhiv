import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Igra extends JPanel {

	Zoga zoga = new Zoga(this); // Zoga ima dostop do Igra in vse kar je public v Igra
	Lopar lopar = new Lopar(this); // Razred Igra moremo posredovat razredu Lopar.
	
	public int hitrost = 1; // Hitrost za zogo in lopar. Nam steje tudi tocke.

	// >> MAIN <<
	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("I G R A");

		Igra igra = new Igra();

		frame.add(igra);
		frame.setSize(300, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		while (true) {
			igra.premakni(); // zoga + lopar se premikajo ...
			igra.repaint(); // ...igra ponovno izrise zaslon
			Thread.sleep(10); // ZAKASNITEV - oz hitros zoge
		}

	} // >> END MAIN <<
	
	//KONSTRUKTOR
	public Igra() {
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				lopar.tipkaSpuscena(e);
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				lopar.tipkaPritisnjena(e);
				
			}
		});
		
		setFocusable(true);
	}
	

	private void premakni() {
		zoga.premakni();
		lopar.premakni();
	}
	
	private int getTocke() {
		return this.hitrost -1;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		zoga.paint(g2d);
		lopar.paint(g2d);
		
		// Izris tock:
		g2d.setColor(Color.RED);
		g2d.setFont(new Font("Verdana", Font.BOLD, 30));
		g2d.drawString(String.valueOf(this.getTocke()), 10, 30);

	}
	
	public void gameOver() {
		JOptionPane.showMessageDialog(this,  "GAME OVER");	
		System.exit(0);
	}

}
