package com.atharvapuranik.udemyrestapi.Course;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.atharvapuranik.udemyrestapi.Course.Course;

public interface SpringDataJpa extends JpaRepository<Course, Integer> {
    List<Course> findByName(String Name);
}

