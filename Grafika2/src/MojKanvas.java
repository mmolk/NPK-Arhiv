import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class MojKanvas extends JComponent {
	
	public void paint(Graphics g) {
//		g.setColor(Color.BLUE);
//		g.fillOval(30, 30, 50, 70);
//				
//		g.setColor(Color.BLACK);
//		g.fill3DRect(10, 120, 50, 30, true);
//		
//		g.setColor(Color.PINK);
//		g.drawString("Danes je lep dan", 10, 10);
		
		g.setColor(Color.BLACK);
		g.fill3DRect(10, 10, 10, 100, true);
		g.setColor(Color.BLACK);
		g.fill3DRect(10, 100, 190, 10, true);
		g.setColor(Color.BLACK);
		g.fill3DRect(100, 10, 10, 100, true);
		g.setColor(Color.BLACK);
		g.fill3DRect(100, 10, 100, 10, true);
		
	}

}
