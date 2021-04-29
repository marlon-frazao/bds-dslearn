package com.marlon.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlon.dslearnbds.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {
	
}
