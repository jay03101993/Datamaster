package com.Service;

import java.io.IOException;
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
import com.Bean.AllSubjects;
import com.DAO.StudentsDAO;
import com.DAO.SubjectsDAO;

/**
 * Servlet implementation class ListSubjectsService
 */
@WebServlet("/SubjectsListService")
public class ListSubjectsService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Log log = LogFactory.getLog(ListSubjectsService.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListSubjectsService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SubjectsDAO sbd = new SubjectsDAO();
		List<AllSubjects>  getAllSubjects = sbd.listSubjects();
		log.info(getAllSubjects.toString());
		request.setAttribute("listOfSubjects", getAllSubjects);
		RequestDispatcher rd = request.getRequestDispatcher("subjectList.jsp");
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
