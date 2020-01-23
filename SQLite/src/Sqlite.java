import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Sqlite {

	public static void main(String[] args) {

		Connection povezava = null;
		Statement stmt = null;

		try {
			Class.forName("org.sqlite.JDBC");

			// :testnaDB.db je ime DB. Lahko damo relativno ali absolutno pot.
			// "~/database.db" naredi file v home folderju:
			povezava = DriverManager.getConnection("jdbc:sqlite:testnaDB.db");
			
			// USTVARJANJE TABELE.
			String sqlUkaz = "CREATE TABLE osebe " + 
								"(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
								"ime CHAR(30), " +
								"priimek CHAR(30) NOT NULL, " +
								"naslov CHAR(60), " +
								"mesto CHAR(40), " +
								"posta CHAR(4), " +
								"letoRojstva INTEGER);";
			
			stmt = povezava.createStatement();
			
			// Najprej zbrise ze obstojeco tabelo...
			String removeTable = "DROP TABLE osebe;";
			stmt.executeUpdate(removeTable);
			
			// ...in jo naredi se enkrat:
			stmt.executeUpdate(sqlUkaz);
			
			// VSTAVLJANJE PRVE OSEBE:
			String sqlInsertOseba1 = "INSERT INTO osebe(ime, priimek, naslov, mesto, posta, letoRojstva)"
										+ "VALUES ('Janez', 'Novak', 'Ulica 15', 'Mesto', '1000', 1950)";
			stmt.executeUpdate(sqlInsertOseba1);
			
			// VSTAVLJANJE DRUGE OSEBE:
			String ime = "Igor";
			String priimek = "Ivanovski";
			String naslov = "Ulica v mesto 22";
			
			String sqlInsertOsebaIgor = "INSERT INTO osebe(ime, priimek, naslov)"
											+ "VALUES ('" + ime + "', '" + priimek + "', '" + naslov + "')";
			stmt.executeUpdate(sqlInsertOsebaIgor);
			
			// VSTAVLJANJE TRETJE OSEBE:
			String sqlInsertOseba3 = "INSERT INTO osebe(ime, priimek, naslov, mesto, posta, letoRojstva)"
											+ "VALUES ('Mauro', 'Zanchetta', 'Via 25', 'Verona', '6543', 1962)";
			stmt.executeUpdate(sqlInsertOseba3);
			
			// SPREMEMBA IMENA:
			String sqlSpremeniIme = "UPDATE OSEBE " + 
									"SET ime = 'IVAN' " + 
									"WHERE id = 1 ";
			stmt.executeUpdate(sqlSpremeniIme);
			
			// BRISANJE IZ TABELE:
			String sqlBrisi = "DELETE FROM OSEBE " +
							  "WHERE id = 2 ";
			stmt.executeUpdate(sqlBrisi);
			
			// IZPIS IZ TABELE:
			String sqlPoizvedbaVse = "SELECT * " +
									 "FROM osebe ";
			
			ResultSet rs = stmt.executeQuery(sqlPoizvedbaVse);
			
			while(rs.next() ) {
				int id = rs.getInt("id");
				String imeOsebe = rs.getString("ime");
				String priimekOsebe = rs.getString("priimek");
				String naslovOsebe = rs.getString("naslov");
				String mesto = rs.getString("mesto");
				String posta = rs.getString("posta");
				int letoRojstva = rs.getInt("letoRojstva");
				
				System.out.println("ID: " + id);
				System.out.println("IME: " + imeOsebe);
				System.out.println("PRIIMEK: " + priimekOsebe);
				System.out.println("NASLOV: " + naslovOsebe);
				System.out.println("MESTO: " + mesto);
				System.out.println("POSTA: " + posta);
				System.out.println("LETO ROJSTVA: " + letoRojstva);
				System.out.println();
			}
			
			// KONEC PROGRAMA:
			System.out.println("Povezava z SQLite vzpostavljena");
			povezava.close();
		} catch (Exception e) {
			System.out.println("Prislo je do napake: " + e.getMessage());
		}

	}

}
