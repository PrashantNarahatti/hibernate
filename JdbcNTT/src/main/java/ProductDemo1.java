import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="Prashant";
		String password="@Pacchu3";
		String query = "SELECT * FROM products";
//		String instertQuery="insert into products values(101,'Laptop',40000,'Electronics')";
//		String instertQuery="insert into products values(102,'Keyboard',500,'Electronics')";
//		String instertQuery="insert into products values(103,'Mouse',350,'Electronics')";
//		String instertQuery="insert into products values(104,'T-Shirt',900,'Clothing')";
//		String instertQuery="insert into products values(105,'Jeans',1500,'Clothing')";
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection(url,username,password);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        //int i=st.executeUpdate(instertQuery);
        while(rs.next()) {
        	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" ");
        }
//        if(i>0){
//        	System.out.println("row inserted");
//        }
        con.close();
	}

}
