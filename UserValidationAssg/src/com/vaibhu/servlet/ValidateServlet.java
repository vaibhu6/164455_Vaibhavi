package com.vaibhu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vaibhu.dao.IUserDAO;
import com.vaibhu.dao.InvalidUserException;
import com.vaibhu.dao.UserDAO;
import com.vaibhu.util.DAOUtility;


@WebServlet("/Validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		RequestDispatcher rd=null;
		
		String userType="Invalid";
		try{
			userType=getUserType(username,password);
		}
		catch(InvalidUserException a){
			out.print("Invalid user credentials");
		}
		if(userType.equals("Admin")){
			rd=request.getRequestDispatcher("/Admin");
		}else if(userType.equals("User")){
			rd=request.getRequestDispatcher("/User");
		}
		/*else{
			rd=request.getRequestDispatcher("/Invalid");
		}*/
		rd.forward(request,response);
	}

	private String getUserType(String username, String password) {
		IUserDAO dao=DAOUtility.getUserDAO();
		return dao.getUserType(username, password);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
		return;
	}

}
