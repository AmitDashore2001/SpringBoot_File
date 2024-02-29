package com.springrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.springrest.entity.Course;
import com.springrest.service.MyService;

@RestController
@RequestMapping("/course")
public class MyController {

    @Autowired
    private MyService myService;

//	@GetMapping("/home")
//	public String show() {
//		return "This is home page";

    @PostMapping("/")
    public Course addCourse(@RequestBody Course course) {
        return this.myService.addCourse(course);
    }

    @GetMapping("/")
    public List<Course> getAllCourses() {
        return this.myService.getAllCourse();
    }

    @GetMapping("/{id}")
    public Optional<Course> getCourseById(@PathVariable Long id) {
        return this.myService.getCourse(id);
    }

    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable long id, @RequestBody Course course) {
             return this.myService.updateCourse(id,course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable long id ){
        this.myService.deleteCourse(id);
    }
}
