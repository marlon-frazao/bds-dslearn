package com.marlon.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlon.dslearnbds.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
