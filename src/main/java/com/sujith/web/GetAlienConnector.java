package com.sujith.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sujith.web.dao.AlienDao;
import com.sujith.web.model.Alien;


public class GetAlienConnector extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int aid=Integer.parseInt(request.getParameter("aid"));
		
		AlienDao dao=new AlienDao();
		
		Alien a1=dao.getAlien(aid); 
		
		request.setAttribute("alien", a1);
		RequestDispatcher rd=request.getRequestDispatcher("showAlien.jsp");
		rd.forward(request, response);
		
		
	}

	

}
