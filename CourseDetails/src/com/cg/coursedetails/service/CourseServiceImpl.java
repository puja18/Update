package com.cg.coursedetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.coursedetails.dao.ICourseDao;
import com.cg.coursedetails.dto.Course;


@Service("courseservice")
@Transactional
public class CourseServiceImpl implements ICourseService {
	@Autowired
	private ICourseDao courseDao;
	@Override
	public List<Course> display() {
		// TODO Auto-generated method stub
		return courseDao.display();
	}

}
