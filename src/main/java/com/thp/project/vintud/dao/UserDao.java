package com.thp.project.vintud.dao;


import java.util.ArrayList; 
import java.util.List;

import com.thp.project.vintud.entity.User;


public interface UserDao {
		
	public void creerUnCompte () ;	
	public User chooseUserSpecifications ();	
	public void afficherRoles() ;
	public User connectAccount () ; 
	public void modificationInformationsPersonnelles () ;
	public void afficherUtilisateurs() ;
	
	public ArrayList<User> findAllUsers () ;

	
}
