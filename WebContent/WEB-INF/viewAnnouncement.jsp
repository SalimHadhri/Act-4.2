<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.thp.project.vintud.entity.Announcement"%>
<%@page import="java.util.ArrayList"%>


 

  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
                      "http://www.w3.org/TR/html4/loose.dtd">
                      
                      
 <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des Annonces</title>
</head>
<body>

   <%@ include file = "header.jsp"  %>
   
   
	<h1>  Liste des Annonces </h1>
	

	
		<table border='1' width='100%'>
		
			<tr><th>identifiant</th><th>title</th><th>description</th><th>category</th><th>price</th><th>localisation</th></tr>
			
			
		        <c:forEach items="${listAnnonces}" var="annonce"  >
		                <tr>
		                        <th><c:out value="${annonce.getId_annoucement()}" /></th>
		                        <th><c:out value="${annonce.title}" /></th>
		                        <th><c:out value="${annonce.description}" /></th>
		                        <th><c:out value="${annonce.category.name}" /></th>
		                        <th><c:out value="${annonce.price}" /></th>
		                        <th><c:out value="${annonce.localisation}" /></th>	                        
		                  </tr>		                     
		                   
		        </c:forEach>
			</table>
		


</body>
</html>