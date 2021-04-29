package com.marlon.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlon.dslearnbds.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
