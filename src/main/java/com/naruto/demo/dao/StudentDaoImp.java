package com.naruto.demo.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.naruto.demo.model.Student;

@Repository
public class StudentDaoImp implements StudentDao {

	@Autowired
	private SessionFactory factory;
	
	@Override
	public void add(final Student student) {
		factory.getCurrentSession().save(student);
	}

	@Override
	public void edit(final Student student) {
		factory.getCurrentSession().merge(student);
	}

	@Override
	public void delete(final Student student) {
		factory.getCurrentSession().delete(student);
	}

	@Override
	public Student getStudent(final int studentId) {
		return (Student) factory.getCurrentSession().get(Student.class, studentId);
	}

	@Override
	public List<Student> getAllStudents() {
		return factory.getCurrentSession().createQuery("from Student").list();
	}

}
