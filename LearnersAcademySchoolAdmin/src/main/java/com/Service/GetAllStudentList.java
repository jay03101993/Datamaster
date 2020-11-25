package com.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.Bean.AllStudents;
import com.DAO.StudentsDAO;

/**
 * Servlet implementation class GetAllStudentList
 */
@WebServlet("/GetAllStudentList")
public class GetAllStudentList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Log log = LogFactory.getLog(GetAllStudentList.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllStudentList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		StudentsDAO std = new StudentsDAO();
		List<AllStudents>  getAllStudents = std.listStudents();
		log.info(getAllStudents.toString());
		request.setAttribute("listOfStudents", getAllStudents);
		RequestDispatcher rd = request.getRequestDispatcher("studentList.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
