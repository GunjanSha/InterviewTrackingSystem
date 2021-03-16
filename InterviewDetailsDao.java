package com.cg.its.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.its.entity.InterviewSchedule;

public class InterviewDetailsDao implements InterviewDetails {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("InterviewSchedule");
	EntityManager em = emf.createEntityManager();
	// private Object id1;

	public void CandidateInfo() {

	}

	public void ScheduleInterview(InterviewSchedule sch) throws Exception, ClassNotFoundException {

		em.getTransaction().begin();
		String query = "INSERT INTO public.interviewschedule1(\r\n"
				+ "	\"c_id\", \"i_id\", \"c_name\", \"i_date\", \"i_starttime\", location, \"i_type\", \"e_id\")\r\n"
				+ "	VALUES (:a, :b, :c, :d, :e, :f, :g, :h)";
		em.createNativeQuery(query).setParameter("a", sch.getC_id()).setParameter("b", sch.getI_id())
				.setParameter("c", sch.C_name()).setParameter("d", sch.getI_date())
				.setParameter("e", sch.getI_startTime()).setParameter("f", sch.getLocation())
				.setParameter("g", sch.getI_type()).setParameter("h", sch.getE_id()).executeUpdate();
		em.getTransaction().commit();
	}

	public void UpdateInterviewSchedule(int id1, InterviewSchedule sch1) {
		em.getTransaction().begin();
		List<InterviewSchedule> i = em.createQuery("select e from InterviewSchedule e where e.I_id = :id1",
				InterviewSchedule.class).setParameter("id1", id1).getResultList();
		for (InterviewSchedule update : i) {
			update.setI_date(sch1.getI_date());
			update.setI_startTime(sch1.getI_startTime());
			update.setI_type(sch1.getI_type());
			update.setE_id(sch1.getE_id());
		}
		em.getTransaction().commit();
	}

	public void CancelInterview(int id2) {
		em.getTransaction().begin();
		em.createQuery("delete from InterviewSchedule e where e.I_id = :id1").setParameter("id1", id2).executeUpdate();
		em.getTransaction().commit();
		emf.close();
		em.close();
	}

	@Override
	public void EmployeeInfo() {
		// TODO Auto-generated method stub

	}

}
