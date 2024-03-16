import java.sql.Connection;

public class InsertData {
	public static void main(String[] args) {
		try {
			Connection conn = DBConn.getConnection();
			
			String insertQuery = "INSERT INTO food (FoodID, foodName, Description, Popularimpressions, Rating) VALUES (0, 'Undhiyu', 'Mixed vegetable dish', 'Flavorful and rich', 4.5)";
			
			int rowsAffected = conn.createStatement().executeUpdate(insertQuery);
			
			if(rowsAffected > 0) {
				System.out.println("Data inserted Successfully!");
			} else {
				System.out.println("Failed to insert Data!");
			}
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
