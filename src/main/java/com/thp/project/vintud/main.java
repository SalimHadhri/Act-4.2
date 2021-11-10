package com.thp.project.vintud;

import java.util.ArrayList;

import com.thp.project.vintud.dao.AnnouncementDao;
import com.thp.project.vintud.dao.CategoryDao;
import com.thp.project.vintud.dao.FavorisDAO;
import com.thp.project.vintud.dao.RechercheDAO;
import com.thp.project.vintud.dao.UserDao;
import com.thp.project.vintud.dao.factory.DAOFactory;
import com.thp.project.vintud.entity.Announcement;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		

		UserDao userDao = DAOFactory.getUserDAO();
		AnnouncementDao announcementDao = DAOFactory.getAnnoucementDAO() ;
		FavorisDAO favorisDAO = DAOFactory.getFavorisDAO();
		RechercheDAO rechercheDAO = DAOFactory.getRechercheDAO() ;
		CategoryDao categoryDao = DAOFactory.getCategoryDAO() ; 
	ArrayList<Announcement> nfjnf = announcementDao.findAllAnnoucement();
		
		
		for(Announcement j : nfjnf) {
			
			
			System.out.println(j.toString());
			
		}
		
		//announcementDao.consulterAnnonces(); 
		
		
		
	}
	
	
	

}
