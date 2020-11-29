package com.DAO;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Bean.AllSubjects;
import com.Bean.AllTeachers;

public class TeachersDAO {
	private Log log = LogFactory.getLog(TeachersDAO.class);

	public Session userDetailsSessionFactory() {
        SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(AllTeachers.class)
            .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
        return session;
    }
	
	public synchronized List<AllTeachers> listTeachers() {
        log.info("Entering Method listTeachers ");
        Session session = this.userDetailsSessionFactory();
        List<AllTeachers> teachersList = new ArrayList<AllTeachers>();
        try {
        	teachersList =  session.createQuery(" from AllTeachers").getResultList();
			 log.info(teachersList.toString());
        } catch (Exception re) {
            log.error(" Error while executing the method listTeachers " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method listTeachers");

        }
		return teachersList;
	}

	
	public synchronized void addTeachers(AllTeachers teachers) {
        log.info("Entering Method addTeachers ");
        Session session = this.userDetailsSessionFactory();
        try {
        	if(teachers.getTeaherId() <= 0) {
    			session.save(teachers);
        	}
			session.getTransaction().commit();
			
        } catch (Exception re) {
			session.getTransaction().rollback();
            log.error(" Error while executing the method addTeachers " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method addTeachers");

        }
    }
}
