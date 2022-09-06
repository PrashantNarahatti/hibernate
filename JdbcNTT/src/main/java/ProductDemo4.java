import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDemo4 {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "Prashant";
		String password = "@Pacchu3";
		String query = "SELECT * FROM products";
		Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection(url,username,password);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);

		
	}

}
