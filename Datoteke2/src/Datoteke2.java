import java.io.File;

public class Datoteke2 {

	public static void main(String[] args) {
		
		File mojaDatoteka = new File("mapa");
		
		if(!mojaDatoteka.isDirectory() ) {
			mojaDatoteka.mkdirs();
		}
		
		if(mojaDatoteka.isDirectory() ) {
			String[] vsebinaMape = mojaDatoteka.list();
			
			System.out.println("Vsebina mape: ");
			
			for(int i = 0; i<vsebinaMape.length; i++) {
				System.out.println(vsebinaMape[i]);
			}
		}

	}

}
