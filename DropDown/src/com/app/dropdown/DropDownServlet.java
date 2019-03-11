package com.app.dropdown;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myservlet
 */
@WebServlet("/DropDownServlet")
public class DropDownServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DropDownServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
	
		
		try( PrintWriter out=response.getWriter()){
			//ArrayList<String> country=new ArrayList<>();
			ArrayList<String> state_india=new ArrayList<>();
			ArrayList<String> state_china=new ArrayList<>();
			
			state_india.add("Maharashtra");
			state_india.add("Karnataka");
			state_china.add("Shilong");
			state_china.add("Meryok");
			String country=request.getParameter("country");
			if(country.equals("India"))
			{
				response.getWriter().write(" <select>");
				response.getWriter().write("<option>"+"state"+"</option>");
				for(int i=0;i<state_india.size();i++)
				{
					response.getWriter().write("<option>"+state_india.get(i)+"</option>");
					
			
				}
				response.getWriter().write("</select>");
				/*response.getWriter().write("<select>");
				response.getWriter().write("<option>"+"city"+"</option>");
				response.getWriter().write("</select>");*/
			}
			if(country.equals("China"))
			{
				response.getWriter().write("<select>");
				response.getWriter().write("<option>"+"state"+"</option>");
				for(int i=0;i<state_china.size();i++)
				{
					response.getWriter().write("<option>"+state_china.get(i)+"</option>");
				}
				response.getWriter().write("</select>");
				/*response.getWriter().write("<select>");
				response.getWriter().write("<option>"+"city"+"</option>");
				response.getWriter().write("</select>");*/
			}
		
			
			
		}
	}
	
	

}