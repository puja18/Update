package com.cg.coursedetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.coursedetails.dto.Course;
import com.cg.coursedetails.service.ICourseService;




 @Controller
public class MyController {
	    @Autowired
		ICourseService courseservice;
	

	 @RequestMapping(value="coursedetails")
		public ModelAndView showAllCourses(){
			List<Course> myAllData=courseservice.display();
			return new ModelAndView("coursedetails","temp", myAllData);
			}
	 
	 @RequestMapping(value="dosearch")
	 public String displaySucess() {
		 return "sucess";
	 }

 
 
 
 }
 
 
