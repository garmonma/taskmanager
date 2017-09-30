package com.nni.taskmanager.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nni.taskmanager.taskmanager.domain.Team;

public interface TeamRepository extends JpaRepository<Team, Long>{
	
}
