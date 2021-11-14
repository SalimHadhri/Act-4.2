package com.thp.project.vintud.dao;


import java.util.ArrayList; 
import java.util.List;

import com.thp.project.vintud.entity.User;


public interface UserDao {
		
	public int creerUnCompte (User user) ;	
	public User chooseUserSpecifications ();	
	public void afficherRoles() ;
	public User connectAccount () ; 
	public void modificationInformationsPersonnelles () ;
	public void afficherUtilisateurs() ;
	
	public ArrayList<User> findAllUsers () ;
	
	public int findIdRoleByName(String name) ;
	public boolean emailExist(String email) ;

	
}
