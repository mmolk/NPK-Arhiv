import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//Za dodat driverje za MySQL:
//Project -> properties -> Java BuildPath -> Classpath -> Add external JAR
public class Mysql {

	public static void main(String[] args) throws InterruptedException{
		
		Connection povezava;
		Statement stmt;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://192.168.2.2:3306/employees";
			povezava = DriverManager.getConnection(url, "npk", "npkgeslo");
			
			stmt = povezava.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM employees LIMIT 100");
			
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " 
								 + rs.getString(2) + " " 
								 + rs.getString(3) + " " 
								 + rs.getString(4));
				Thread.sleep(getRnd());
			}
			
			System.out.println("Povezava je vzpostavljena!");
		} catch (Exception e) {
			System.out.println("Prislo je do napake: " + e.toString());
		}

	} // END MAIN
	
	public static int getRnd() {
		return (int) (Math.random()*1000+10);
	}

}
