package com.marlon.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlon.dslearnbds.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
