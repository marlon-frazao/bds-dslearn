package com.marlon.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlon.dslearnbds.entities.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long> {

}
