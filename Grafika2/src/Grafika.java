import javax.swing.JFrame;

public class Grafika {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//prve dve cifre določajo, kje se nariše frame glede na rob ekrana:
		frame.setBounds(100, 200, 400, 400);
		
		frame.getContentPane().add(new MojKanvas() );
		
		frame.setVisible(true);

	}
	
	

}
