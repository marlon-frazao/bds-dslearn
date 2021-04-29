package com.marlon.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlon.dslearnbds.entities.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long> {

}
