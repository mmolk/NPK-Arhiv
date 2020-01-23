import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Premikanje implements Runnable {

	JFrame okvir;
	int mojX = 400;
	int mojY = 400;
	Canvas kanvas;
	BufferStrategy bufferStrategy;
	boolean dela = true;

	//MAIN
	public static void main(String[] args) {
		Premikanje premik = new Premikanje();

		new Thread(premik).start();		

	}//end main

	public void  run() {
		while(this.dela) {
			Paint();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e.getStackTrace() );
			}
		}
	}

	//Konstruktor:
	public Premikanje() {
		okvir = new JFrame("Premikanje");

		JPanel polje = (JPanel) okvir.getContentPane();
		polje.setPreferredSize(new Dimension(500, 500));
		polje.setLayout(null);

		kanvas = new Canvas();
		kanvas.setBounds(0, 0, 500, 500);
		kanvas.setIgnoreRepaint(false);

		polje.add(kanvas);

		okvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okvir.pack(); //Prilagodi velikost glede na komponente
		okvir.setResizable(false);
		okvir.setVisible(true);

		kanvas.createBufferStrategy(2);
		this.bufferStrategy = kanvas.getBufferStrategy();
		kanvas.requestFocus(); //kanvas mora imet fokus, če ne se ne zgodi nič, ko premikamo.

		kanvas.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent event) {
				premakni(event);
			}
		});


	}

	protected void premakni(KeyEvent event) {
		switch (event.getKeyCode() ) {
		case KeyEvent.VK_DOWN:
			mojY += 5;
			break;
		case KeyEvent.VK_UP:
			mojY -= 5;
			break;
		case KeyEvent.VK_LEFT:
			mojX -= 5;
			break;
		case KeyEvent.VK_RIGHT:
			mojX += 5;
			break;
		}

	}



	public void Paint() {
		Graphics2D g = (Graphics2D) this.bufferStrategy.getDrawGraphics();
		g.clearRect(0, 0, 500, 500); //ko premikamo krog, ga brie na prejnšnjem mestu
		Paint(g);
		this.bufferStrategy.show();

	}

	//Metoda, ki narise krog:
	protected void Paint(Graphics2D g) {
		g.fillOval(mojX, mojY, 30, 30);
	}








}