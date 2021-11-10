package com.thp.project.vintud.dao.controller;


import java.util.ArrayList; 
import java.util.List;

import com.thp.project.vintud.dao.UserDao;
import com.thp.project.vintud.dao.factory.DAOFactory;
import com.thp.project.vintud.entity.User;



public class UserController {
	
	UserDao userDAO = DAOFactory.getUserDAO() ;
	
	public UserController() {
	}
	
	public ArrayList<User> getAllUsers() {		
		return userDAO.findAllUsers();	
	}
	
	
	

}
