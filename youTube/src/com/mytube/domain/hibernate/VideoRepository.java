package com.mytube.domain.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mytube.domain.hibernate.Video;
import com.mytube.domain.hibernate.VideoRepository;

public class VideoRepository {

	public Video findById(long id) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();

		Video videoById = session.find(Video.class, id);
		
		//session.close();
		//sessionFactory.close();
		
		return videoById;
	}
	
}
