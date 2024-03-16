import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDataFromUser {
	public static void main(String[] args) {
		try {
			Connection conn = DBConn.getConnection();
			
			String query = "INSERT INTO food (FoodID, foodName, Description, Popularimpressions, Rating) VALUES (0, ?, ?, ?, ?)";	//? -> placeholders
			
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Food Name: ");
			pstmt.setString(1, sc.nextLine());
			
			System.out.println("Food Description: ");
			pstmt.setString(2, sc.nextLine());
			
			System.out.println("Food PopularImpressions: ");
			pstmt.setString(3, sc.nextLine());
			
			System.out.println("Food Rating: ");
			pstmt.setFloat(4, sc.nextFloat());
			
			if(pstmt.executeUpdate() > 0) {
				System.out.println("Data inserted Successfully!");
			} else {
				System.out.println("Failed to insert Data!");
			}
			
			sc.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/*
INSERT INTO food (FoodName, Description, PopularImpressions, Rating) VALUES
('Ghari', 'Sweet dish', 'Festive and aromatic', 4.7),
('Surti Sev Khamani', 'Savory snack', 'Tangy and filling', 4.0),
('Ponk', 'Tender sorghum grains', 'Nutty and seasonal', 4.3),
('Khandvi', 'Roll made from gram flour', 'Smooth and savory', 4.4),
('Shrikhand', 'Sweet strained yogurt', 'Creamy and sweet', 4.8),
('Surati Undhiyu', 'Mixed vegetable dish', 'Aromatic and hearty', 4.9),
('Fafda', 'Crunchy snack', 'Served with chutney', 4.1);
*/