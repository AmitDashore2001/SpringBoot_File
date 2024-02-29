package com.springrest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.dao.CourseDao;
import com.springrest.entity.Course;

@Service
public interface MyService {
	
	public List<Course> getAllCourse();

	public Optional<Course> getCourse(long id);

	public Course addCourse(Course course);

	public void deleteCourse(long id);

	public Course updateCourse(long id, Course course);

}
