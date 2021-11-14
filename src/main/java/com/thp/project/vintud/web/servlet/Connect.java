package com.thp.project.vintud.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.thp.project.vintud.dao.AnnouncementDao;
import com.thp.project.vintud.dao.UserDao;
import com.thp.project.vintud.dao.controller.AnnouncementController;
import com.thp.project.vintud.dao.controller.CategoryController;
import com.thp.project.vintud.dao.controller.ConnectionController;
import com.thp.project.vintud.dao.factory.DAOFactory;
import com.thp.project.vintud.entity.Announcement;
import com.thp.project.vintud.entity.Category;
import com.thp.project.vintud.entity.User;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession; 



@WebServlet("/connect")
public class Connect extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Connect() {
        // TODO Auto-generated constructor stub
    }

    ConnectionController connectionController = new ConnectionController() ;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
    	request.getRequestDispatcher("/WEB-INF/connect.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();	
		
		
		 	String email = request.getParameter("email");
	        String pwd = request.getParameter("password");
	        
	        ViewAnnouncement viewAnnouncement = new ViewAnnouncement();
	        
	        User userConnected = new User() ;
	        
	        userConnected= connectionController.connectedUser(email, pwd) ;
	        
	        

	        
	        
	        if(userConnected.getId_user() == -1) {

	        	out.print("<p>Email or password incorrect !! Make another try ;)</p>");
				request.getRequestDispatcher("/WEB-INF/connect.jsp").include(request, response);
		                	        	
	        }
	        else {
	        	HttpSession session = request.getSession();
		        session.setAttribute("id", userConnected.getId_user());
		        session.setAttribute("nom", userConnected.getName());
		        session.setAttribute("prenom", userConnected.getFirstname());

		        session.getServletContext().getRequestDispatcher("/WEB-INF/viewAnnouncement.jsp").forward(request, response); 	
	        }
	        
		
	}

}
