package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainSakila {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		//EntityManager em = sessionFactory.createEntityManager();
		
		Customer c = session.find(Customer.class, 1L);
		System.out.println(c.getId() + " " + c.getFirstname() + " " + c.getLastname());
		
		Customer c2 = new Customer();
		c2.setFirstname("thomas");
		c2.setLastname("gros");
		c2.setEmail("thomas.gros@example.com");
		c2.setStoreId(1L);
		c2.setAddressId(1L);
		
		session.getTransaction().begin();
		session.persist(c2);
		
		
		Customer c599 = session.find(Customer.class, 599L);
		c599.setFirstname("TEST");
		session.remove(c599);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}

}
