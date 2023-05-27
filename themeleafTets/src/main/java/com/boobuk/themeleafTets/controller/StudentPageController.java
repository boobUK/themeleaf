package com.boobuk.themeleafTets.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.boobuk.themeleafTets.models.Student;

@Controller
public class StudentPageController {

	@RequestMapping("/student")
	public ModelAndView getStudent() {
		ModelAndView model = new ModelAndView("student");
		Student student = new Student();
		student.setName("John");
		student.setScore(99);
		model.addObject("student", student);
		return model;
	}

	@RequestMapping("/students")
	public ModelAndView getStudents() {
		ModelAndView model = new ModelAndView("students");
		Student student1 = new Student();
		student1.setName("John");
		student1.setScore(99);

		Student student2 = new Student();
		student2.setName("Sam");
		student2.setScore(25);

		model.addObject("students", Arrays.asList(student1, student2));
		return model;
	}
	
	@RequestMapping("/studentForm")
	public ModelAndView displayStudentForm() {
		ModelAndView model = new ModelAndView("studentForm");
		Student student = new Student();
		model.addObject("student", student);
		return model;
	}
	
	@RequestMapping("/saveStudent")
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		ModelAndView model = new ModelAndView("result");
		System.out.println(student.getName());
		System.out.println(student.getScore());
		return model;
	}

}
