package com.nni.taskmanager.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
