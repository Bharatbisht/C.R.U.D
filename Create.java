package crud;                                                                                                                            

import java.sql.*;                                                                                                        

public class Create {                                                                                                                    
	public void create(int id,String uname,String email) {                                                                              
		 try {                                                                                                                           
				Class.forName("com.mysql.cj.jdbc.Driver");                                                                               
				System.out.println("connected");                                                                                         
			} catch (ClassNotFoundException e) {                                                                                         
				// TODO Auto-generated catch block                                                                                       
				e.printStackTrace();                                                                                                     
			}                                                                                                                            
		   String url="jdbc:mysql://localhost:/office";                                                                                  
		   String user="root";                                                                                                           
		   String password="";                                                                                                           
		    try {                                                                                                                        
				Connection con=DriverManager.getConnection(url,user,password);                                                           
				                                                                                                                         
				PreparedStatement pr=con.prepareStatement("INSERT INTO `table`(`ID`,`Name`,`Email`) VALUES(?,?,?)");                     
				pr.setInt(1,id);                                                                                                         
				pr.setString(2,uname);                                                                                                   
				pr.setString(3,email);                                                                                                   
				pr.executeUpdate();                                                                                                      
				pr.close();                                                                                                              
				con.close();                                                                                                             
				} catch (SQLException e) {}                                                                                              
	}                                                                                                                                    
                                                                                                                                         
}                                                                                                                                        
                                                                                                                                         