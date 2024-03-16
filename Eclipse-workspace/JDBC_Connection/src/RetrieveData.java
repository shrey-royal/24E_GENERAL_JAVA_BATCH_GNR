import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveData {
	public static void main(String[] args) {
		try {
			Connection conn = DBConn.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM food");
			
			System.out.println("FoodID\tFoodName\t\tDescription\t\tPopularImpressions\t\tRating");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString("FoodName") + "\t\t\t" + rs.getString(3) + "\t\t\t" + rs.getString(4) + "\t\t" + rs.getFloat("Rating"));
			}
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}