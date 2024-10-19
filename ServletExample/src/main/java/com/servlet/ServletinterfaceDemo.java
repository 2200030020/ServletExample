package com.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class ServletinterfaceDemo implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
	    PrintWriter pw =  res.getWriter();
	        pw.print("<HTML>");
	        pw.print("<HEAD><TITLE> SERVLET DEMO </TITLE></HEAD>");
	        pw.print("<BODY>");
	        pw.print("<H2> Hello from Servlet Interface... </H2>");
	        pw.print("</BODY>");
	        pw.print("</HTML>");

	}
	
	
}
