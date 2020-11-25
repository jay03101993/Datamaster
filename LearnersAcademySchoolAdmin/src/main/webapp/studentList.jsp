<%@page import="com.Service.GetAllStudentList"%>
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
<title>Insert title here</title>
</head>
<body>

<% List eList = (ArrayList)session.getAttribute("listOfStudents");%>
<table>
    <%
    for(int i=0; i<eList.size();i++){%>
        <tr>
            <td><%out.print(eList[i]); %></td>
            <td><%= ((Employee)eList[i]).getEname() %></td>  
        </tr>
      <%}%>
</table>



<h1>Displaying Student List</h1> 
      <table border ="1" width="500" align="center"> 
         <tr bgcolor="00FF7F"> 
            <tr> 
                <th>Student Name</th>
                <th>Student Class</th>
                <th>Subject Code</th>
            </tr> 
            
          
         <c:forEach items="${listOfStudents}" var="student">
                <tr>
                    <td><c:out value="${student.studentName}" /></td>
                    <td><c:out value="${student.studentClass}" /></td>
                    <td><c:out value="${student.subjectCode}" /></td>
                </tr>
            </c:forEach>
         
        </table>  
        <hr/> 
</body>
</html>