package com.project.hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryHibernate {
	private static final SessionFactory sessionFactory;
	private static String configFile = "hibernate.cfg.xml";

    static {
        try {
           Configuration cfg = new Configuration().configure(configFile);
           StandardServiceRegistryBuilder sb = new StandardServiceRegistryBuilder();
           sb.applySettings(cfg.getProperties());
           StandardServiceRegistry standardServiceRegistry = sb.build();
           sessionFactory = cfg.buildSessionFactory(standardServiceRegistry);
           
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    public static void shutdown() {
        sessionFactory.close();
    }
}
