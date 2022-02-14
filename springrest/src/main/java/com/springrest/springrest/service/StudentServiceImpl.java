package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.StudentDao;
import com.springrest.springrest.entity.Students;

@Service //to help spring identify this class as service class
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	public StudentServiceImpl() {
	
	}
 //since the impl is implementing service, it should override all its methods hence @override annotation	
	@Override
	public List<Students> getAllStudents() {
		
		return studentDao.findAll();
	}

	@Override
	public Optional<Students> getStudents(Long studentId) {
		
			return studentDao.findById(studentId);
		}

	@Override
	public Students addStudent(Students student) {
		
		return studentDao.save(student);
	}

	
	
	}

