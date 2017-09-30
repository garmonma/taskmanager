package com.nni.taskmanager.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nni.taskmanager.taskmanager.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
