package com.springrest.springrest.service;

import java.util.List;
import java.util.Optional;
import com.springrest.springrest.entity.Students;

public interface StudentService {

	public List<Students> getAllStudents();

	public Optional<Students> getStudents(Long studentId);

	public Students addStudent(Students student);

	
}
