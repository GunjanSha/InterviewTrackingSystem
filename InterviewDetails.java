package com.cg.its.dao;

import com.cg.its.entity.InterviewSchedule;

public interface InterviewDetails {
	public void CandidateInfo ();
	public void ScheduleInterview(InterviewSchedule sch) throws Exception, ClassNotFoundException;
	public void UpdateInterviewSchedule(int id1,  InterviewSchedule sch1);
	public void CancelInterview(int id2);
	public void EmployeeInfo ();
}

