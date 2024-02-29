package com.springrest.service;

import static org.mockito.Mockito.verify;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.springrest.dao.CourseDao;
import com.springrest.entity.Course;

@ExtendWith(MockitoExtension.class)
public class CourseServiceTest {
	
	@Mock
	private CourseDao courseDao;
	
	private MyService myService;
	
	@BeforeEach
	void setUp() {
		this.myService=new MyServiceImpl(this.courseDao);
	}

	@Test
     void getAllCourses() {
    	
    	 this.myService.getAllCourse();
    	 verify(courseDao).findAll();
    	
    		}
     }
