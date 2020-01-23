
public class Izjeme1 {

	public static void main(String[] args) {
		
		try{
			int x = 123;
			int y = 0;
			int rez = x / y;	
		}
		catch (Exception e) {
			System.out.println("Pri racunanju je prislo do napake.");
			System.out.println(e);
		}
		
		System.out.println("Danes je lep dan!");
		

	}

}