package com.omerenlicay;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class JpaDeneme {
	
	
public static void main(String[] args) {
		
		Personel personel1 =new Personel();
		
		//personel1.setPersonelid(1);
		personel1.setPersonelAdi("büþra");
		personel1.setPersonelSoyadi("bacak");
		
		//--JPA------------------------------------
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("PU_08_JPA");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
			entityManager.persist(personel1);
		entityTransaction.commit();
		
		entityManager.close();
		entityManagerFactory.close(); 
		
		//--HÝBERNATE------------------------------------
	    /*	
	  	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		session.beginTransaction();
		session.save(personel1);
		session.getTransaction().commit();
		*/
	
		
	
	}

}
