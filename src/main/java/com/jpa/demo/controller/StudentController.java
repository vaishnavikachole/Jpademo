package com.jpa.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jpa.demo.dao.StudentRepository;
import com.jpa.demo.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepository repository;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(Student student)
	{
		repository.save(student);
		return "home.jsp";
	}

}
