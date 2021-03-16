package com.cg.its.client;

import java.sql.SQLException;
//import java.sql.SQLException;
import java.util.Scanner;

import com.cg.its.entity.CandidateEntity;
//import com.cg.its.model.Candidate;
import com.cg.its.service.CandidateDao;

public class AdminCandidate {
	  public static void main(String [] args) throws ClassNotFoundException, SQLException {
		  
		  System.out.println("Select the task you want to perform");
		  System.out.println("1 . Add Candidate");
		  System.out.println("2. Delete Candidate");
		  System.out.println("3. Update Candidate");
		  System.out.print("4. View Candidate");
		  CandidateDao service = new CandidateDao();
		  Scanner s = new Scanner(System.in);
		  int value = s.nextInt();
		  switch(value) {	  
		  case 1 :  CandidateEntity c = new CandidateEntity();
		  			System.out.println("Enter Candidate details:"+"\n");
		  			Scanner sc = new Scanner(System.in);
		  			System.out.println("Enter Candidate id:");
		  			int id = sc.nextInt();
		  			System.out.println("Enter Candidate name:");
		  			String name = sc.next();
		  			System.out.println("Enter Candidate Primary Skill: ");
		  			String primarySkill = sc.next();
		  			System.out.println("Enter Candidate Secondary Skill: ");
		  			String secondarySkill = sc.next();
		  			System.out.println("Enter Candidate Qualification: ");
		  			String qualification = sc.next();
		  			System.out.println("Enter Candidate Notice period in months: ");
		  			int noticePeriod = sc.nextInt();
		  			System.out.println("Enter Candidate Location");
		  			String location = sc.next();
		  			System.out.println("Enter Candidate Past Experence in year: ");
		  			int experience = sc.nextInt();
		  			c.setC_id(id);
		  			c.setC_name(name);
		  			c.setPrimarySkill(primarySkill); 
		  			c.setSecondarySkill(secondarySkill);
		  			c.setQualification(qualification);
		  			c.setNoticePeriod(noticePeriod);
		  			c.setLocation(location);
		  			c.setExperience(experience);
		  			service.addCandidate(c);
		  			break;
		  case 2 :
		  			System.out.println("Enter Candidate Id to delete");
		  			int id1 = s.nextInt();
			  	service.deleteCandidate(id1);
		  			break;
		  case 3 : //Scanner s = new Scanner(System.in);
			System.out.println("Enter Candidate Id to update");
				int id3 = s.nextInt();
			
			   
			  service.updateCandidate(id3);
		  			break;
		  case 4 :  System.out.println("Enter Candidate Id to find details");
					int id2 = s.nextInt();
					service.viewCandidate(id2);
		  			break;
		  default : System.out.println("Wrong Input Please Enter 1 -4");			
				  
		  }	 
		  s.close();
	  }
}
