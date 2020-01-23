import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grafika  extends JPanel{

	public static void main(String[] args) {
		
		JFrame okno = new JFrame();
		
		okno.setSize(300, 300);
		
		//Naredimo objekt tipa Grafika s konstruktorjem od JPanel:
		okno.add(new Grafika() );
		
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setVisible(true);

	}
	
	public void paint(Graphics g) {
		//(x - odmik od levega roba, y - odmik od zgornjega roba, sirina, visina)
		g.drawRect(5, 10, 30, 50);
		g.setColor(Color.BLUE);
		g.fillRect(60, 50, 30, 23);
		g.drawRoundRect(10, 100, 50, 50, 10, 10);
		g.setColor(Color.RED);
		g.drawOval(50, 10, 30, 30);
	}

}
