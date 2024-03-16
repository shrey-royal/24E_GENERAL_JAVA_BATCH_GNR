import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		try {
			Connection conn = DBConn.getConnection();
			
			String createTableQuery = "CREATE TABLE IF NOT EXISTS food (\r\n" + 
					"	FoodID INT PRIMARY KEY AUTO_INCREMENT,\r\n" + 
					"	FoodName VARCHAR(100),\r\n" + 
					"	Description TEXT,\r\n" + 
					"	PopularImpressions TEXT,\r\n" + 
					"	Rating FLOAT CHECK (Rating >= 0 AND Rating <= 5)\r\n" + 
					");";
			
			Statement stmt = conn.createStatement();
			int rowsAffected = stmt.executeUpdate(createTableQuery);
			
			if(rowsAffected >= 0) {
				System.out.println("Table Created Successfully");
			} else {
				System.out.println("Failed to Create Table");
			}
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
