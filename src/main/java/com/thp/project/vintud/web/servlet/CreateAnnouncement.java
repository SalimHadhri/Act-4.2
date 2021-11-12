package com.thp.project.vintud.web.servlet;

import java.io.IOException; 
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;

import com.thp.project.vintud.dao.controller.AnnouncementController;
import com.thp.project.vintud.dao.controller.CategoryController;
import com.thp.project.vintud.entity.Announcement;
import com.thp.project.vintud.entity.Category;

import jakarta.servlet.RequestDispatcher;
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
    
    
    

    ViewAnnouncement viewAnnouncement = new ViewAnnouncement() ;

    
    AnnouncementController announcementController = new AnnouncementController() ;
    
    CategoryController categoryController = new CategoryController() ;
    
	ArrayList<Announcement> annonces = announcementController.getAllAnnonces() ;		

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.getRequestDispatcher("/WEB-INF/createAnnouncement.jsp").forward(request, response);



	}


	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		//					<tr><td>price : </td><td><input type="number" id="price" step="0.01" name="price"/></td></tr>  	


		
		String titre=request.getParameter("title");
		String description=request.getParameter("description");
		String category_name=request.getParameter("category");
		//String price=request.getParameter("price");
		String localisation=request.getParameter("localisation");
		//String identifiant = request.getParameter("id");
		Announcement announcement = new Announcement() ;
		

		//announcement.setId_annoucement(4);
		announcement.setTitle(titre) ;
		announcement.setDescription(description) ;	
		
		
		announcement.setPrice(Integer.parseInt(request.getParameter("price"))) ;	
		announcement.setId_annoucement(Integer.parseInt(request.getParameter("id")));

		
		
		announcement.setLocalisation(localisation) ;	
		announcement.setUser_id(1);
		int idCat = categoryController.getIdByName(category_name) ;	
		announcement.setCategory_id(idCat);
		announcement.setPicture("A voir");
		   Timestamp time =  Timestamp.valueOf(LocalDateTime.now()) ;

		announcement.setPublication_date( new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(time));
		announcement.setIs_available(true);
		announcement.setView_number(10);
		
	
		
		announcementController.addAnnouncement(announcement) ;
  
		//request.getRequestDispatcher("/WEB-INF/viewAnnouncement.jsp").forward(request, response);
        response.sendRedirect("viewAnnouncement");


      
    }
	


		
	}
	
	

	
		
		
	


