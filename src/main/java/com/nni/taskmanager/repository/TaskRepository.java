package com.nni.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nni.taskmanager.domain.Task;


@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
	
}
