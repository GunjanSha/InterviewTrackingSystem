package com.cg.its.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cg.its.entity.CandidateEntity;

public class CandidateDbDao implements CandidateDb{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("candidate");
	EntityManager em = emf.createEntityManager();

	public void insert(CandidateEntity c) throws ClassNotFoundException, SQLException {     
		
		em.getTransaction().begin();
		CandidateEntity c1 = new CandidateEntity();
		c1.setC_id(c.getC_id());
		c1.setC_name(c.getC_name());
		c1.setPrimarySkill(c.getPrimarySkill());
		c1.setSecondarySkill(c.getSecondarySkill());
		c1.setQualification(c.getQualification());
		c1.setNoticePeriod(c.getNoticePeriod());
		c1.setLocation(c.getLocation());
		c1.setExperience(c.getExperience());
		em.persist(c1);
		em.getTransaction().commit();
	}
	
	
	public void updateCandidate(int id3) {
	//CandidateEntity update=em.find(CandidateEntity.class,id);  
	CandidateEntity update=em.find(CandidateEntity.class,id3);  
	   em.getTransaction().begin();
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter name");
	   update.setC_name(s.next());
	   System.out.println("Enter Primaryskill");
	   update.setPrimarySkill(s.next());
	   System.out.println("Enter secondayskill");
	   update.setSecondarySkill(s.next());
	   System.out.println("Enter Qualification");
	   update.setQualification(s.next());
	   System.out.println("Enter Notice Period");
	   update.setNoticePeriod(s.nextInt());
	   System.out.println("Enter Location");
	   update.setLocation(s.next());
	   System.out.println("Enter Experience");
	   update.setExperience(s.nextInt());
	  
	   
	   
	   em.getTransaction().commit();
	   s.close();
	}
	public void viewCandidate(int id2) {
 CandidateEntity query = em.find(CandidateEntity.class, id2 );
//		 Query query =em.createQuery("Select c from candidate c");
			    
			         System.out.println("Candidate detail for C_id "+query.getC_id() +" are : ");
			         System.out.println("Candidate name - "+query.getC_name());
			         System.out.println("Candidate primary skill - "+query.getPrimarySkill());
			         System.out.println("Candidate Secondary Skill - "+ query.getSecondarySkill());
			         System.out.println("Candidate Qualification - "+query.getQualification());
			         System.out.println("Candidiate Notice Period - "+query.getNoticePeriod());
			         System.out.println("Candidiate Location - "+query.getLocation());
			         System.out.println("Candidiate Past Experience - "+query.getExperience());
			      
	}

	public void deleteCandidate(int id1) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		CandidateEntity c = em.find(CandidateEntity.class, id1);
		em.remove(c);  
		em.getTransaction().commit();  
		emf.close();  
		em.close();
		
	}
}
