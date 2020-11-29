package com.DAO;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Bean.AllClasses;
import com.Bean.AllStudents;

public class ClassesDAO {
	private Log log = LogFactory.getLog(ClassesDAO.class);
	
	public Session userDetailsSessionFactory() {
		 SessionFactory sessionFactory = new Configuration()
		            .configure("hibernate.cfg.xml")
		            .addAnnotatedClass(AllClasses.class)
		            .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
        return session;
    }
	
	public synchronized List<AllClasses> listClasses() {
        log.info("Entering Method listClasses ");
        Session session = this.userDetailsSessionFactory();
        List<AllClasses> classesList = new ArrayList<AllClasses>();
        try {
        	classesList =  session.createQuery(" from AllClasses").getResultList();
			 log.info(classesList.toString());
        } catch (Exception re) {
            log.error(" Error while executing the method listClasses " + re.getMessage() + re.getClass());
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
		return classesList;
	}

}
