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

import com.Bean.AllClasses;
import com.Bean.AllStudents;
import com.DAO.ClassesDAO;
import com.DAO.StudentsDAO;

/**
 * Servlet implementation class ClassesListService
 */
@WebServlet("/ClassesListService")
public class ListClassesService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Log log = LogFactory.getLog(ListStudentsService.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListClassesService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ClassesDAO cDao = new ClassesDAO();
		List<AllClasses> getAllClasses = cDao.listClasses();
		log.info(getAllClasses.toString());
		request.setAttribute("listOfClasses", getAllClasses);
		RequestDispatcher rd = request.getRequestDispatcher("classesList.jsp");
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
