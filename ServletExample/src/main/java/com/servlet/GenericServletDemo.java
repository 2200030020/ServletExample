package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletDemo extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest arg0, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		Date d=new Date();
		PrintWriter pw=res.getWriter();
		pw.print("<html>");
		pw.print("<head><title>GenericServletDemo</title></head>");
		pw.print("<body>");
		pw.print("<h2>Created Generic Servlet @"+d.toString()+"</h2>");
		pw.print("</body>");
		pw.print("</html>");
		
	}
	

}