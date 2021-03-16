package com.cg.its.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
	@Entity  (name="InterviewSchedule")
	@Table(name = "interviewschedule1")  
	public class InterviewSchedule  {
		@Id
		@Column(name = "c_id")
		private int C_id;
		private int I_id;
	    private String C_name;
		private String I_date;
		private String I_startTime; 
		private String location ;
		private String I_type;
		private int E_id;
		
		public int getC_id() {
			return C_id;
		}
		public void setC_id(int c_id) {
			C_id = c_id;
		}
	
		public int getI_id() {
			return I_id;
		}
		public void setI_id(int i_id) {
			I_id = i_id;
		}
		public String C_name() {
			return C_name;
		}
		public void setc_name(String C_name) {
			this.C_name = C_name;
		}
		public String getI_date() {
			return I_date;
		}
		public void setI_date(String i_date) {
			I_date = i_date;
		}
		public String getI_startTime() {
			return I_startTime;
		}
		public void setI_startTime(String i_startTime) {
			I_startTime = i_startTime;
		}

		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getI_type() {
			return I_type;
		}
		public void setI_type(String i_type) {
			 this.I_type = i_type;
		}
		public int getE_id() {
			return E_id;
		}
		public void setE_id(int e_id) {
			E_id = e_id;
		}
		
	}

