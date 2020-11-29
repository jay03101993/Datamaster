package com.Service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.AllSubjects;
import com.Bean.AllTeachers;
import com.DAO.SubjectsDAO;
import com.DAO.TeachersDAO;

/**
 * Servlet implementation class AddTeachersService
 */
@WebServlet("/AddTeachersService")
public class AddTeachersService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTeachersService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		String teacherName,teacherQualification;

		teacherName = request.getParameter("teacherName");
		teacherQualification = request.getParameter("teacherQualification");
		
		AllTeachers teachers = new AllTeachers(teacherName, teacherQualification);
		try {
			TeachersDAO td = new TeachersDAO();
			td.addTeachers(teachers);
			response.sendRedirect("teacherAddSuccessful.jsp");
		} catch (Exception e) {
			response.sendRedirect("teacherAddFailure.jsp");
		}
	
	}

}
