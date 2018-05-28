package com.naruto.demo.dao;

import java.util.List;

import com.naruto.demo.model.Student;

public interface StudentDao {

	public void add(final Student student);
	
	public void edit(final Student student);
	
	public void delete(final Student student);
	
	public Student getStudent(final int studentId);
	
	public List<Student> getAllStudents();
}
