<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Students</title>
</head>
<body>
<center>
<h1>Add Subjects</b></h1>

<form action="AddSubjectsService" method="post">

<h2>Subject Name  : <input type="text" name="subjectName"></h2>
<pre>
*Note : Enter Name of the subject, i.e Rohit Sharma
</pre>
<br>
<h2>Subject Class : <input type="text" name="subjectClass"></h2>
<pre>
*Note : Enter subject classes as Roman numeric, i.e for class Five enter V
</pre>
<br>
<br>
                <input type="submit" value ="Add Subject">
<br>
<br>  
</pre>
</center>
</body>
</html>