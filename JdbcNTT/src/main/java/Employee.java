import java.sql.*;
public class Employee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="Prashant";
		String password="@Pacchu3";
		String query = "SELECT * FROM employee3";
		String instertQuery="insert into employee3 values(4,'Shankar')";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection(url,username,password);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        //int i=st.executeUpdate(instertQuery);
        while(rs.next()) {
        	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" ");
        }
//        if(i>0){
//        	System.out.println("row inserted");
//        }
        con.close();
	}

}
