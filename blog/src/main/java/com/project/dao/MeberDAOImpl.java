package com.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.MemberDAO;
import com.project.hibernate.SessionFactoryHibernate;
import com.project.vo.MemberVO;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@Repository
public class MeberDAOImpl implements MemberDAO{

	@Override
	public List list() {
		SessionFactory sessionFactory = SessionFactoryHibernate.getSessionFactory();
		Session session = sessionFactory.openSession();
		List result = (List) session.createQuery("from BLOG_MEMBER").list();
		session.close();
		System.out.println(result);
		return result;
	}
	
	
}
