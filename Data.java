package crud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crud.Create;

@WebServlet(value="/data")
public class Data extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	 int id=Integer.parseInt(req.getParameter("id"));
	 String uname=req.getParameter("uname");
	 String email=req.getParameter("email");
	 String operation=req.getParameter("operation");
	 PrintWriter out=res.getWriter();
	 //out.println(id);
	 //out.println(uname);
	 //out.println(email);
	
   
	 //jdbc operation
		 if(operation.equals("create")) { 
			 
		 System.out.println("create");
		 
		 Create create=new Create();
		 create.create(id,uname,email);
	   
		}else if(operation.equals("read")){
			
		  System.out.println("read");
	      
		}else if(operation.equals("update")){
			
		   out.println("update");
		   
		  Update.update(id,uname,email);
	       
		}else if(operation.equals("delete")){
		
			out.println("delete");
	        
			Delete.delete(id);
	       }
	    // response to back.jsp
		  RequestDispatcher rd=req.getRequestDispatcher("/View.jsp");	
		 rd.forward(req,res);
		
	}
}
