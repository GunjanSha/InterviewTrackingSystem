package com.cg.its.service;

import java.sql.SQLException;



import com.cg.its.dao.CandidateDbDao;
import com.cg.its.entity.CandidateEntity;

public class CandidateImp implements Candidate {
	
	public void addCandidate(CandidateEntity c) throws ClassNotFoundException, SQLException {
		 CandidateDbDao data = new CandidateDbDao();
		  data.insert(c);
		
	}
	
	public void deleteCandidate(int id1) {
		CandidateDbDao data = new CandidateDbDao();
		 data.deleteCandidate(id1);
		 
	}

	public void viewCandidate(int id2) {
		CandidateDbDao data = new CandidateDbDao();
		 data.viewCandidate(id2);
	
	}

	public void updateCandidate(int id3) {
		CandidateDbDao data = new CandidateDbDao();
		data.updateCandidate(id3);
		
	}



}
