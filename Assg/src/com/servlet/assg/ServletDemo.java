package com.servlet.assg;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletDemo")
public class ServletDemo<HttpServletRequest, HttpServletResponse> extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ServletDemo() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		
		
		
		String user = request.getParameter("uname");
		String gend = request.getParameter("gender");
		String city = request.getParameter("city");
		String hobby = request.getParameter("hobby");
		String hobbyy = request.getParameter("hobby1");
		String hobbyyy = request.getParameter("hobby2");
		
		out.println("Hai " + user + ", Your Gender is " + gend + ", Your from " + city + ", Your Hobbies are " + hobby +  hobbyy + hobbyyy);
	}

	
}
