package com.thp.project.vintud.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.thp.project.vintud.entity.Announcement;
import com.thp.project.vintud.entity.Category;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse; 



@WebServlet("/createAnnouncement")
public class CreateAnnouncement extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CreateAnnouncement() {
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/createAnnouncement.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String titre=request.getParameter("title");
		String description=request.getParameter("description");
		String category_name=request.getParameter("category");
		String price=request.getParameter("price");
		String localisation=request.getParameter("localisation");
		
		
		Announcement announcement = new Announcement() ;
		announcement.setTitle(titre) ;
		announcement.setDescription(description) ;
		Category categori = new Category() ;
		categori.setName(category_name) ;
		announcement.setCategory(categori) ;
		announcement.setPrice(Float.parseFloat(price)) ;
		announcement.setLocalisation(localisation) ;
		
		request.getRequestDispatcher("createAnnouncement.html").include(request, response);
	
		
	}

}
