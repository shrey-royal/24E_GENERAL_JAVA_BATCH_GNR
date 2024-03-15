import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			//Step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2
			//url - jdbc:mysql://<dbhost>:<dbport>/<dbname>
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nightjava", "root", "root");
			
			if(conn != null) {
				System.out.println("Connection to DB");
			} else {
				System.out.println("Failed to connect to DB");
			}
//			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
//	public static void main(String[] args) {
//		DBConn.getConnection();
//	}
}
