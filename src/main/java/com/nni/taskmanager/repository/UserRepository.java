package com.nni.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nni.taskmanager.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}