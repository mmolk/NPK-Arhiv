
public class Izjeme2 {

	public static void main(String[] args) {
		int [] tabela = new int[2];
		
		try {
			tabela[0] = 3123;
			tabela[1] = 5 + 7;
			tabela[2] = 5;
		} catch (ArithmeticException e) {
			System.out.println("Pri racnanju je prislo do napake!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Napaka: pri naslavljanju tabele je prislo do napake!");
		}
		
		System.out.println("Danes je lep dan");

	}

}
