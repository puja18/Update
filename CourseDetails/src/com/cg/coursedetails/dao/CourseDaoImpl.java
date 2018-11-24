package com.cg.coursedetails.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.coursedetails.dto.Course;
@Repository("coursedao")
public class CourseDaoImpl implements ICourseDao{
	@PersistenceContext
	EntityManager em;

	@Override
	public List<Course> display() {
		// TODO Auto-generated method stub
	    Query query = (Query) em.createQuery("SELECT c FROM Course c");
		List<Course> courses = query.getResultList();
		return courses;
	}

}
