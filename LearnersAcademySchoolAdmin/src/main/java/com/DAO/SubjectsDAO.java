package com.DAO;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Bean.AllStudents;
import com.Bean.AllSubjects;

public class SubjectsDAO {
	private Log log = LogFactory.getLog(SubjectsDAO.class);

	public Session userDetailsSessionFactory() {
        SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(AllSubjects.class)
            .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
        return session;
    }
	
	public synchronized List<AllSubjects> listSubjects() {
        log.info("Entering Method listSubjects ");
        Session session = this.userDetailsSessionFactory();
        List<AllSubjects> subjectsList = new ArrayList<AllSubjects>();
        try {
        	 subjectsList =  session.createQuery(" from AllSubjects").getResultList();
			 log.info(subjectsList.toString());
        } catch (Exception re) {
            log.error(" Error while executing the method listSubjects " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method listSubjects");

        }
		return subjectsList;
	}

	
	public synchronized void addSubjects(AllSubjects subjects) {
        log.info("Entering Method addSubjects ");
        Session session = this.userDetailsSessionFactory();
        try {
        	if(subjects.getSubjectId() <= 0) {
    			session.save(subjects);
        	}
			session.getTransaction().commit();
			
        } catch (Exception re) {
			session.getTransaction().rollback();
            log.error(" Error while executing the method addSubjects " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method addSubjects");

        }
    }
}
