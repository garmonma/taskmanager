package com.nni.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nni.taskmanager.domain.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
	
}
