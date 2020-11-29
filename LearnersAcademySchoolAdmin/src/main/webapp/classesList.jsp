<%@page import="com.Bean.AllStudents"%>
<%@page import="com.Bean.AllClasses"%>
<%@page import="com.DAO.ClassesDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1>Displaying Student List</h1> </center>
      <table border ="1" width="500" align="center"> 
         <tr bgcolor="00FF7F"> 
            <tr> 
                <th>Class ID</th>
                <th>Class</th>
                <th>Subject Code</th>
            </tr> 
          
           <%ArrayList<AllClasses> classesList = (ArrayList<AllClasses>)request.getAttribute("listOfClasses");
           out.println(classesList);
           %> 
          <% for( AllClasses cs : classesList) { %>
               <tr> 
                <td><%= cs.getClassID() %></td>
                <td><%= cs.getClassName()%></td>
                <td><%= cs.getSubjectCode()%></td>
               </tr>
            <%} %>
         
        </table>  
        <hr/>



</body>
</html>