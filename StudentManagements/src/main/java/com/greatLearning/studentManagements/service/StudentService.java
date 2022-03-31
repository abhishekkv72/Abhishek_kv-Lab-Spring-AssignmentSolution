package com.greatLearning.studentManagements.service;

import java.util.List;

import com.greatLearning.studentManagements.entity.Student;

public interface StudentService {

	public List<Student> findAll();

	public void save(Student student);

	public void deleteById(int Id);

	public Student findById(int Id);

}
