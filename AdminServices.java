package com.cg.its.service;

import com.cg.its.entity.InterviewSchedule;

public interface AdminServices {
	
	public void CandidateInfo ();
	public void ScheduleInterview(InterviewSchedule sch) throws ClassNotFoundException, Exception;
	public void UpdateInterviewSchedule(int id1, InterviewSchedule sch1);
	public void CancelInterview(int id3);
	public void EmployeeInfo ();
}

