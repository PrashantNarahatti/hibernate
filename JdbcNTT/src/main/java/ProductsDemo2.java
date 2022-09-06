import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProductsDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Product Code : ");
		int code = sc.nextInt();

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

		con.close();

	}

}
