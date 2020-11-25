package com.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import com.Bean.AllStudents;

public class StudentsDAO {
	
	private Log log = LogFactory.getLog(StudentsDAO.class);

	public Session userDetailsSessionFactory() {
        SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(AllStudents.class)
            .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
        return session;
    }
	
	public List<AllStudents> listStudents() {
        log.info("Entering Method listStudents ");
        Session session = this.userDetailsSessionFactory();
        List<AllStudents> studentsList = new ArrayList<AllStudents>();
        try {
			 studentsList =  session.createQuery(" from AllStudents").getResultList();
			 log.info(studentsList.toString());
        } catch (Exception re) {
            log.error(" Error while executing the method listStudents " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method listClasses");

        }
		return studentsList;
	}

	
	
	
}
