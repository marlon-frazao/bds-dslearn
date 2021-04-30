package com.marlon.dslearnbds.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.marlon.dslearnbds.entities.Notification;
import com.marlon.dslearnbds.entities.User;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

	@Query("SELECT obj FROM Notification obj WHERE "
			+ "(obj.user = :user) AND "
			+ "(:unreadOnly = false OR obj.read = false) "
			+ "ORDER BY obj.moment DESC ")
	Page<Notification> find(User user, boolean unreadOnly, Pageable pageable);
}
