package crud;

import java.sql.*;
import java.util.*;
public class Read {
	public static List<String> read() {
		
		List<String> list=new ArrayList<String>();
		
		System.out.println("Read.java");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {}
		String url="jdbc:mysql://localhost:/office";
		try {
			Connection con=DriverManager.getConnection(url,"root","");
			PreparedStatement ps=con.prepareStatement("SELECT * from `table`");
			//ps.getInt("id");
			
			//ps.execute();
			//Statement st=con.createStatement();
			
			ResultSet rs=ps.executeQuery();
			
					
			while(rs.next()) {
				 // String id= Integer.toString(rs.getInt("id"));
				  
				  list.add(rs.getString("id"));
                  
				  list.add(rs.getString("name"));
                  
                  list.add(rs.getString("email"));  
			}
			System.out.println(list); 
			
		//	list(bean.getid());
			 System.out.println("Task Completed"); 
		} catch (SQLException e) {}
		
		return list;
		
	}
	
}
