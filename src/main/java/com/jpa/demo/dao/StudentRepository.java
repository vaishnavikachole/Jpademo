package com.jpa.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.demo.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>
{
	

}
