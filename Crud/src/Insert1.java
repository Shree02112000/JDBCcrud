import java.sql.*;
public class Insert1 {
	
	public static void insertData()throws Exception{
String url="jdbc:mysql://127.0.0.1:3306/userdb";
String username="root";
String password="0211";
String Query="insert into user values(?,?,?)";
Connection con=DriverManager.getConnection(url,username,password);
PreparedStatement pst=con.prepareStatement(Query);
pst.setInt(1, 2);
pst.setString(2, "luckie");
pst.setString(3, "luckie@gmail.com");
pst.executeUpdate();
con.close();
	
	}
	
	public static void main(String[]args) throws Exception {
		insertData();
	}
	

}
