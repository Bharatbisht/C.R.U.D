package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void delete(int id) {
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String url="jdbc:mysql://localhost:/office";
	try {
		Connection con=DriverManager.getConnection(url,"root","");
		PreparedStatement ps=con.prepareStatement("DELETE FROM `table` WHERE ID=?");
		
		ps.setInt(1, id);
		ps.execute();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}