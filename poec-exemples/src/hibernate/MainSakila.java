package hibernate;

import javax.persistence.EntityManager;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainSakila {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		EntityManager em = sessionFactory.createEntityManager();
		
		Customer c = em.find(Customer.class, 1L);
		System.out.println(c.getId() + " " + c.getFirstname() + " " + c.getLastname());
		
	}

}
