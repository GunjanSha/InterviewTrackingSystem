package com.cg.its.service;

import com.cg.its.dao.InterviewDetailsDao;
import com.cg.its.entity.InterviewSchedule;

public class AdminServicesDao implements AdminServices {
	
	

	public void ScheduleInterview(InterviewSchedule sch) throws Exception {
		// TODO Auto-generated method stub
		InterviewDetailsDao data = new InterviewDetailsDao();
		data.ScheduleInterview(sch);
	}
	
	public void UpdateInterviewSchedule(int id1, InterviewSchedule sch1) {
		// TODO Auto-generated method stub
		InterviewDetailsDao data = new InterviewDetailsDao();
		 data.UpdateInterviewSchedule(id1, sch1);
		
	//	Query query = em.createQuery("SELECT sch FROM InterviewSchedule");
//		 em.getTransaction().begin();
//		List list =query.getResultList();
//		for(int i = 0 ; i <list.size(); i++) {
//			InterviewScheduleDao data = (InterviewScheduleDao) list.get(i);
//			System.out.println(data);
//		}
//		   em.getTransaction().commit();-----------
//		
	}

	public void CancelInterview(int id2) {
		// TODO Auto-generated method stub
		InterviewDetailsDao data = new InterviewDetailsDao();
		data.CancelInterview(id2);
		
	}

	@Override
	public void CandidateInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EmployeeInfo() {
		// TODO Auto-generated method stub
		
	}

	

	
	}



