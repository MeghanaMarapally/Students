package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entity.Students;

public interface StudentDao extends JpaRepository<Students, Long> {

}
