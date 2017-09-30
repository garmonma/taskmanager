package com.nni.taskmanager.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project {
	
	private String name;
	
	private String cycle;
	
	private Date dateCreated;
	
	private Date cycleStartDate;
	
	private User creator;
	
	public Project(){
		
	}
	
}
