package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	int i=Integer.parseInt(req.getParameter("num1"));
	int j=Integer.parseInt(req.getParameter("num2"));
	int k=i+j;
	//System.out.println("Addition of Two numbers:"+k);
	 PrintWriter out=res.getWriter();
	 out.println("Result is="+k);

	 //To call another server ,we have two options,
	 //One is Request Dispatcher and Redirectory
	 //1)We use Request Dispatcher
 

 //Session Management--->to share data between two servlets
 req.setAttribute("k",k);
 
	 RequestDispatcher rd=req.getRequestDispatcher("sq");
	rd.forward(req, res); 
}
}
