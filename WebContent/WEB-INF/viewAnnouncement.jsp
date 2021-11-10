<%@page import="com.thp.project.vintud.entity.Announcement"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
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
		
			<tr><th>title</th><th>description</th><th>category</th><th>price</th><th>localisation</th></tr>
			
			
			<%
			
      		int  size = (int) request.getAttribute("tailleList") ;
			ArrayList<Announcement> liste = (ArrayList<Announcement>)request.getAttribute("listAnnonces") ;
			
			
			
      		
      		for( Announcement an:liste){
			out.print("<tr><th>"+ an.getTitle()+"</th><th>"+an.getDescription()+"</th><th>"+an.getCategory().getName()+"</th><th>"+an.getPrice()+"</th><th>"+an.getLocalisation()+"</th></tr>");	 
		}
		
      		 %>
      		
      		
			
			
			<!-- <c:forEach items="${listAnnonces}" var="annonce">

							<tr>
									<th> <c:out value="${annonce.getTitle()}"/> </th>
									<th> <c:out value="${annonce.getDescription()}"/> </th>							
									<th> <c:out value="${annonce.getCategory()}"/> </th>
									<th> <c:out value="${annonce.getPrice()}"/> </th>
									<th> <c:out value="${annonce.getLocalisation() }"/> </th>
															  
							</tr>
			</c:forEach> -->
			
			
	
			
		</table>


</body>
</html>