package task_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductDemo3 {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number Products : ");
		int code = sc.nextInt();
		
		ArrayList<String> list=new ArrayList<>();

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "Prashant";
		String password = "@Pacchu3";
		String query = "SELECT * FROM products where PROD_CODE=?";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, code);

		ResultSet rs = st.executeQuery();

		System.out.println("Product Details :");
		while (rs.next()) {
			System.out.println("code : " + rs.getString("PROD_CODE"));
			System.out.println("name : " + rs.getString("PROD_NAME"));
			System.out.println("price : " + rs.getString("PROD_PRICE"));
			System.out.println(" category = " + rs.getString("PROD_CATG"));
		}
	}

}
