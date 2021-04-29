package com.marlon.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlon.dslearnbds.entities.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {

}
