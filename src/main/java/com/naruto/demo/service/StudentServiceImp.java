package com.naruto.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.naruto.demo.dao.StudentDao;
import com.naruto.demo.model.Student;

@Service("service")
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	@Transactional
	public void add(final Student student) {
		studentDao.add(student);
	}

	@Override
	@Transactional
	public void edit(final Student student) {
		studentDao.edit(student);
	}

	@Override
	@Transactional
	public void delete(final Student student) {
		studentDao.delete(student);
	}

	@Override
	@Transactional
	public Student getStudent(final int studentId) {
		return studentDao.getStudent(studentId);
	}

	@Override
	@Transactional
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}

}
