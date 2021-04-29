package com.marlon.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlon.dslearnbds.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
}
