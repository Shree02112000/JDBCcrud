import java.sql.*;
public class Getuser {
     public static void selectData() throws Exception {
    	 String url="jdbc:mysql://127.0.0.1:3306/userdb";
 		String username="root";
 		String password="0211";
 		String Query="select *from user";
 		Connection con=DriverManager.getConnection(url,username,password);
 		Statement smt=con.createStatement();
 		ResultSet rs=smt.executeQuery(Query);
 		while(rs.next()) {
 			System.out.println("student id "+rs.getInt(1));
 			System.out.println("student name "+rs.getString(2));
 			System.out.println("student email "+rs.getString(3));
 		}
 		con.close();
 ;	}
     
	
	
	public static void main (String[]args) throws Exception {
		
		selectData();
}
}