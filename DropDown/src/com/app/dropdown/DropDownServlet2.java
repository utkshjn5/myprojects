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
 * Servlet implementation class myservlet1
 */
@WebServlet("/DropDownServlet2")
public class DropDownServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DropDownServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
         response.setContentType("text/html");
	
		
		try( PrintWriter out=response.getWriter()){
			//ArrayList<String> country=new ArrayList<>();
			ArrayList<String> city_maharashtra=new ArrayList<>();
			ArrayList<String> city_karnataka=new ArrayList<>();
			ArrayList<String> city_shilong=new ArrayList<>();
			ArrayList<String> city_meryok=new ArrayList<>();
			
			city_maharashtra.add("Kolhapur");
			city_maharashtra.add("Solhapur");
			city_karnataka.add("Bangalore");
			city_karnataka.add("Yashvantpur");
			city_shilong.add("Mahishmati");
			city_shilong.add("Killong");
			city_meryok.add("Beijing");
			city_meryok.add("Feijing");
			String state=request.getParameter("state");
			System.out.println(state);
			System.out.println("i am here");

			if(state.equals("Maharashtra"))
			{
				response.getWriter().write(" Select City :: <select>");
				response.getWriter().write("<option>"+"city"+"</option>");
				for(int i=0;i<city_maharashtra.size();i++)
				{
					response.getWriter().write("<option>"+city_maharashtra.get(i)+"</option>");
					
				
				}
				response.getWriter().write("</select>");
			}
			
			if(state.equals("Shilong"))
			{
				response.getWriter().write(" Select City :: <select>");
				response.getWriter().write("<option>"+"city"+"</option>");
				for(int i=0;i<city_shilong.size();i++)
				{
					response.getWriter().write("<option>"+city_shilong.get(i)+"</option>");
					
				
				}
				response.getWriter().write("</select>");
			}
			
			if(state.equals("Meryok"))
			{
				response.getWriter().write(" Select City :: <select>");
				response.getWriter().write("<option>"+"city"+"</option>");
				for(int i=0;i<city_meryok.size();i++)
				{
					response.getWriter().write("<option>"+city_meryok.get(i)+"</option>");
					
				
				}
				response.getWriter().write("</select>");
			}
			if(state.equals("Karnataka"))
			{
				response.getWriter().write(" Select City:: <select>");
				response.getWriter().write("<option>"+"city"+"</option>");
				for(int i=0;i<city_karnataka.size();i++)
				{
					response.getWriter().write("<option>"+city_karnataka.get(i)+"</option>");
				}
				response.getWriter().write("</select>");
			}
		}

}
}