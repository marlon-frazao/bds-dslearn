package com.marlon.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlon.dslearnbds.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long> {

}
