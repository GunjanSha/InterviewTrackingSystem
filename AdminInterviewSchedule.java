package com.cg.its.client;

//import java.sql.SQLException;
import java.util.Scanner;

import com.cg.its.entity.InterviewSchedule;
//import com.cg.its.model.InterviewSchedule;
import com.cg.its.service.AdminServicesDao;

public class AdminInterviewSchedule {
	public static void main(String[] args) throws Exception {
		System.out.println("Select the task you want to perform");
		System.out.println("1. Add InterviewSchedule");
		System.out.println("2. Update InterviewSchedule");
		System.out.print("3. Cancel Interview");
		AdminServicesDao service = new AdminServicesDao();
		Scanner s = new Scanner(System.in);
		int value = s.nextInt();
		switch (value) {
		case 1:
			InterviewSchedule sch = new InterviewSchedule();
			System.out.println("Enter Schedule Interview for candidates" + "\n");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Candidate id ");
			int C_id = sc.nextInt();
			// CandidateEntity c = new CandidateEntity();
			System.out.println("Enter Interview id ");
			int I_id = sc.nextInt();
			System.out.println("Enter Candidate Name ");
			String C_name = sc.next();
			System.out.println("Enter Interview Date ");
			String date = sc.next();
			System.out.println("Enter Start Time ");
			String S_time = sc.next();
			System.out.println("Enter Location ");
			String location = sc.next();
			System.out.println("Enter Interview Type ");
			String I_type = sc.next();
			System.out.println("Enter Employee id ");
			int E_id = sc.nextInt();

			sch.setC_id(C_id);
			sch.setI_id(I_id);
			sch.setc_name(C_name);
			sch.setI_date(date);
			sch.setI_startTime(S_time);
			sch.setLocation(location);
			sch.setI_type(I_type);
			sch.setE_id(E_id);
			service.ScheduleInterview(sch);
			break;
		case 2:
			InterviewSchedule sch1 = new InterviewSchedule();
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter Interview Id to update ");
			int I_id1 = sc1.nextInt();
			System.out.println("Enter Interview Date ");
			String date1 = sc1.next();
			System.out.println("Enter Start Time ");
			String S_time1 = sc1.next();
			System.out.println("Enter Interview Type ");
			String I_type1 = sc1.next();
			System.out.println("Enter Employee id ");
			int E_id1 = sc1.nextInt();

			sch1.setI_id(I_id1);
			sch1.setI_date(date1);
			sch1.setI_startTime(S_time1);
			sch1.setI_type(I_type1);
			sch1.setE_id(E_id1);
			service.UpdateInterviewSchedule(I_id1, sch1);
			break;

		case 3:
			System.out.println("Enter Interview Id to delete");
			int id2 = s.nextInt();
			service.CancelInterview(id2);
		}
		s.close();
	}
}
