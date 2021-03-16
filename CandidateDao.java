package com.cg.its.service;

import java.sql.SQLException;



import com.cg.its.dao.CandidateDbDao;
import com.cg.its.entity.CandidateEntity;

public class CandidateDao implements Candidate {
	
	public void addCandidate(CandidateEntity c) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 CandidateDbDao data = new CandidateDbDao();
		  data.insert(c);
		 // sc.close();
	}
	
	public void deleteCandidate(int id1) {
		// TODO Auto-generated method stub
		CandidateDbDao data = new CandidateDbDao();
		 data.deleteCandidate(id1);
		 
	}

	public void viewCandidate(int id2) {
		// TODO Auto-generated method stub
		CandidateDbDao data = new CandidateDbDao();
		 data.viewCandidate(id2);
		
	//	Query query = em.createQuery("SELECT c FROM candidate c");
//		 em.getTransaction().begin();
//		List list =query.getResultList();
//		for(int i = 0 ; i <list.size(); i++) {
//			CandidateDao data = (CandidateDao) list.get(i);
//			System.out.println(data);
//		}
//		   em.getTransaction().commit();-----------
//		
	}

	public void updateCandidate(int id3) {
		// TODO Auto-generated method stub
		CandidateDbDao data = new CandidateDbDao();
		data.updateCandidate(id3);
		
	}



}
