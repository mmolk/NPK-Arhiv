import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Slika extends JPanel{

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		frame.getContentPane().add(new Slika());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450, 450);
		frame.setVisible(true);	

	} // >> END MAIN
	
	public void paint(Graphics g) {
		Image img = mojaSlika();
		g.drawImage(img, 10, 10, this);
	}
	
	public Image mojaSlika(){
		BufferedImage bfrImg = null;
		BufferedImage preoblikovanaSlika = null;
		
		try {
			bfrImg = ImageIO.read(new File("boskarin.jpg"));
			
			int[][] pixArray = new int[bfrImg.getHeight()][bfrImg.getWidth()];
			
			for(int i = 0; i < pixArray.length; i++) {
				for(int j = 0; j < pixArray[i].length; j++) {
					pixArray[i][j] = bfrImg.getRGB(j, i);
					System.out.print(pixArray[i][j] + " ");
				}
				System.out.println();
			}
			
			preoblikovanaSlika = new BufferedImage(bfrImg.getWidth(), bfrImg.getHeight(), BufferedImage.TYPE_INT_RGB);
			
			for(int i = 0; i < pixArray.length; i++) {
				for(int j = 0; j < pixArray[i].length; j++) {
					preoblikovanaSlika.setRGB(j, i, pixArray[i][j]);
				}
			}
			
		} catch (IOException e) {
			System.out.println("napaka");
		}
		return preoblikovanaSlika;
		
	}
}
