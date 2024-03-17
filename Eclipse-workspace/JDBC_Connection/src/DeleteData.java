import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteData {

	public static void main(String[] args) {
		try {
			Connection conn = DBConn.getConnection();
			
			String query = "DELETE FROM food WHERE FoodID = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the id that you want to delete: ");
			int id = sc.nextInt();
			
			pstmt.setInt(1, id);
			
			if(pstmt.executeUpdate() > 0) {
				System.out.println("Data deleted Successfully!");
			} else {
				System.out.println("Failed to delete Data!");
			}
			
			pstmt.close();
			sc.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
