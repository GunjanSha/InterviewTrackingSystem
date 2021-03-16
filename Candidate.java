package com.cg.its.service;

import java.sql.SQLException;

import com.cg.its.entity.CandidateEntity;

public interface Candidate {
	
	public void addCandidate(CandidateEntity c) throws ClassNotFoundException, SQLException;
	public void deleteCandidate(int id1);
	public void viewCandidate(int id2);
	public void updateCandidate(int id3);
		
}