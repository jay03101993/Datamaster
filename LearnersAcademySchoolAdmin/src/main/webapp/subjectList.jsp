<%@page import="com.Bean.AllSubjects"%>
<%@page import="com.Service.ListStudentsService"%>
<%@page import="com.Bean.AllStudents"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
body {
  background-color: #8ef285;
}
</style>
<title>Insert title here</title>
</head>
<body>


<center><h1>Displaying Subjects List</h1> </center>
      <table border ="1" width="500" align="center"> 
         <tr bgcolor="00FF7F"> 
            <tr> 
                <th>Subject Id</th>
                <th>Subject Name</th>
                <th>Subject Class</th>
                <th>Subject Code</th>
            </tr> 
          
           <%ArrayList<AllSubjects> subjectList = (ArrayList<AllSubjects>)request.getAttribute("listOfSubjects");
           for( AllSubjects s : subjectList) { %>
           
           <tr> 
            <td><%= s.getSubjectId()%></td>
            <td><%= s.getSubjectName()%></td>
            <td><%= s.getSubjectClass()%></td>
            <td><%= s.getSubjectCode()%></td>
           </tr>
        <%}
           %> 
         
        </table>  
        <hr/> 
</body>
</html>