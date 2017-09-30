package com.nni.taskmanager.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nni.taskmanager.taskmanager.domain.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
	
}
