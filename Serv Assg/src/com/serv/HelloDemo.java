package com.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloDemo")
public class HelloDemo extends HttpServlet {
	
   
    public HelloDemo() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		
		
		String user = request.getParameter("uname");
		String gend = request.getParameter("gender");
		String city = request.getParameter("city");
		String hobby = request.getParameter("hobby");

		
		out.println("Hi " + user + ", Your Gender is " + gend + ", Your from " + city + ", Your Hobbies are " + hobby);
	}

	
}
