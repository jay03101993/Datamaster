<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {
  background-color: #E6E6FA;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome User Page</title>
</head>
<body>
<center>
<br>
<h1>
Welcome Admin User
</h1>
<h2>Students Management</h2> 
<form action="AddStudent" method="get">
<button>Add a Student
</button>
</form>
<form action="StudentsListService" method="get">
<button>View All Student Details
</button>
</form>
<br>
<h2>Classes Management</h2>
<form action="ClassesListService" method="get">
<button>View All Classes Details
</button>
</form>
<br>
<h2>Subjects Management</h2> 
<form action="AddSubject" method="get">
<button>Add a Subject
</button>
</form>
<form action="SubjectsListService" method="get">
<button>View All Subjects Details
</button>
</form>
<br>
<h2>Teachers Management</h2> 
<form action="AddTeacher" method="get">
<button>Add a Teacher
</button>
</form>
<form action="TeachersListService" method="get">
<button>View All Teachers Details
</button>
</center>
</body>
</html>