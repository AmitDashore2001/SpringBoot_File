package com.springrest.service;

import java.util.List;
import java.util.Optional;

import com.springrest.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.dao.CourseDao;
import com.springrest.entity.Course;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class MyServiceImpl implements MyService {

	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}
    //Constructor for UnitTesting
	public MyServiceImpl(CourseDao courseDao) {
		super();
		this.courseDao = courseDao;
	}

	@Override
	public Optional<Course> getCourse(long id) {
		// TODO Auto-generated method stub
		return this.courseDao.findById(id);
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return this.courseDao.save(course);
	    
	}

	@Override
	public void deleteCourse(long id) {
		// TODO Auto-generated method stub
		Course c=this.courseDao.findById(id).orElse(null);
		      this.courseDao.delete(c);
	}

	@Override
	public Course updateCourse(long id, Course course) {
		// TODO Auto-generated method stub
		 Course course1=this.courseDao.findById(id).orElse(null);
		    course1.setTitle(course.getTitle());
		    course1.setDescription(course.getDescription());
            return this.courseDao.save(course1);
	}

}
