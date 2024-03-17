import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UpdateData {
	public static void main(String[] args) {
		try {
			Connection conn = DBConn.getConnection();
			String query = "Update food SET foodName=?, Description=?, Popularimpressions=?, Rating=? WHERE FoodID=?";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			Scanner sc = new Scanner(System.in);
			
			System.out.print("\nEnter the id that you want to update: ");
			int id = sc.nextInt();
			sc.nextLine();	//to clear the buffer memory
			
			ResultSet rs = conn.prepareStatement("SELECT * FROM food WHERE FoodID = " + id).executeQuery();
			
			if(rs.next()) {
				String foodname, desc, pi;
				float r;
				System.out.println("If you do not want to change the previous data then just press enter");
				
				System.out.println("Food Name: ");
				foodname = sc.nextLine();
				
				sc.nextLine();	//to clear the buffer memory
				System.out.println("Food Description: ");
				desc = sc.nextLine();
				
				System.out.println("Food PopularImpressions: ");
				pi = sc.nextLine();
				
				System.out.println("Food Rating: ");
				r = sc.nextFloat();
				
				if(foodname.isEmpty() || foodname == null) {
					foodname = rs.getString("foodName");
				}
				if(desc.isEmpty() || desc == null) {
					desc = rs.getString("Description");
				}
				if(pi.isEmpty() || pi == null) {
					pi = rs.getString("Popularimpressions");
				}
				if(r < 0 || r > 5) {
					r = rs.getFloat("Rating");
				}
				
				pstmt.setString(1, foodname);
				pstmt.setString(2, desc);
				pstmt.setString(3, pi);
				pstmt.setFloat(4, r);
				pstmt.setInt(5, rs.getInt(1));
				
				if(pstmt.executeUpdate() > 0) {
					System.out.println("Data updated Successfully!");
				} else {
					System.out.println("Failed to udpate Data!");
				}
			} else {
				System.out.println("No data found!");
			}
			
			rs.close();
			pstmt.close();
			sc.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
