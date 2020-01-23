
public class Main {

	public static void main(String[] args) {
//		Vaje:
//		Koordinate k1 = new Koordinate(45.547680, 13.738070);
//		Koordinate k2 = new Koordinate(46.236, 15.268);
		
		Koordinate k1 = new Koordinate(4.256, 15.369);
		Koordinate k2 = new Koordinate(-9.478, 20.137);
		Koordinate k3 = new Koordinate(-36.13980, -27.393178);
		Koordinate k4 = new Koordinate(2.369715, -16.302147);
		Koordinate k5 = new Koordinate(110.123, 190.123);
		
		System.out.println("Koordinate Kopra: " + k1.toString() );
		System.out.println("Koordinate Celja: " + k2.toString() );
		
		if(k1.equals(k2) )
			System.out.println("Koordinati sta enaki.");
		else
			System.out.println("Koordinati nista enaki!");
		
		Koordinate[] koordinateMest = new Koordinate[10];
		
		koordinateMest[0] = new Koordinate(13.312434, 70.312452);
		
		System.out.println("Hemisfera koordinat: " + k1.toString() + " je " + k1.hemisfera() + ".");
		System.out.println("Hemisfera koordinat: " + k2.toString() + " je " + k2.hemisfera() + ".");
		System.out.println("Hemisfera koordinat: " + k3.toString() + " je " + k3.hemisfera() + ".");
		System.out.println("Hemisfera koordinat: " + k4.toString() + " je " + k4.hemisfera() + ".");
		
		System.out.println("Preverjanje koordinat: " + k5.getSirina() + " " + k5.getDolzina() );
		
		int x = 90;
		int y = 110;
		
		System.out.println(Math.abs(x-y));
		
		
 
	}

}
