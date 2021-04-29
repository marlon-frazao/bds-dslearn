package com.marlon.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlon.dslearnbds.entities.Section;

public interface SectionRepository extends JpaRepository<Section, Long> {

}
