import java.util.InputMismatchException;
import java.util.Scanner;

public class Izjeme3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner skender = new Scanner(System.in);
		
		try {
			System.out.println("vnesi stevilo: ");
			int stevilo = skender.nextInt();
			
			System.out.println("Vneseno je bilo stevilo: " + stevilo);
		}catch (InputMismatchException e){
			System.out.println(e+" vneseno stevilo ni realno.");
			
		}finally {
			skender.close();
		}
	}

}
