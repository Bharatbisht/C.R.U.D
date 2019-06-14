package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void update(int id,String name,String email) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:/office";
		try {
			Connection con=DriverManager.getConnection(url,"root","");
			
			PreparedStatement ps=con.prepareStatement("UPDATE `table` SET Name=?, Email=? WHERE ID=?");
			ps.setString(1,name);
			ps.setString(2, email);
			ps.setInt(3,id);
			ps.execute();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
