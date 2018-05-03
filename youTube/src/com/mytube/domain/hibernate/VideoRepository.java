package com.mytube.domain.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mytube.domain.hibernate.Video;
import com.mytube.domain.hibernate.VideoRepository;

import java.util.List;

import org.hibernate.Query;


public class VideoRepository {

	public Video findById(long id) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();

		Video videoById = session.find(Video.class, id);
		
		//session.close();
		//sessionFactory.close();
		
		return videoById;
	}
	 public List<Comment> findVideoWithComments(long idVideo) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		 String queryHQL = "SELECT v FROM Video v JOIN FETCH v.comments WHERE v.id = :id";
	        Query<Comment> query = session.createQuery(queryHQL, Comment.class);
	        List<Comment> results = query.getResultList();

		 return results;
	 }
}
