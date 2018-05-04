package com.mytube.domain.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


public class UserRepository {

	public User findUserIdByUsername(String username) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		String queryHQL = "SELECT u FROM User u WHERE u.username = :username";
        Query<User> query = session.createQuery(queryHQL, User.class);
        query.setParameter("username", username);
        User userByUsername = query.uniqueResult();
        

        return userByUsername;
       
        
	}



}
