package com.Service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.AllStudents;
import com.Bean.AllSubjects;
import com.DAO.StudentsDAO;
import com.DAO.SubjectsDAO;

/**
 * Servlet implementation class AddSubjectsService
 */
@WebServlet("/AddSubjectsService")
public class AddSubjectsService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddSubjectsService() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String subjectName, subjectClass, subjectCode;

		subjectName = request.getParameter("subjectName");
		subjectClass = request.getParameter("subjectClass");
		subjectCode = null;
		if (subjectClass.equals("V")) {
			subjectCode = "LA_FIVE";
			// break;
		} else if (subjectClass.equals("VI")) {
			subjectCode = "LA_SIX";
		} else if (subjectClass.equals("VII")) {
			subjectCode = "LA_SEVEN";
		} else if (subjectClass.equals("VIII")) {
			subjectCode = "LA_EIGHT";
		} else if (subjectClass.equals("IX")) {
			subjectCode = "LA_NINE";
		} else if (subjectClass.equals("X")) {
			subjectCode = "LA_TEN";
		}

		AllSubjects subjects = new AllSubjects(subjectName, subjectClass, subjectCode);
		try {
			SubjectsDAO sbd = new SubjectsDAO();
			sbd.addSubjects(subjects);
			response.sendRedirect("subjectAddSuccessful.jsp");
		} catch (Exception e) {
			response.sendRedirect("subjectAddFailure.jsp");
		}
	}

}
