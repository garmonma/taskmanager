package com.nni.taskmanager.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "project")
public class Project {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotNull
    @Size(min = 4, max = 25)
    @Column(length = 25, unique = true, nullable = false, name = "name")
	private String name;
	
    @Column(name = "cycle")
	private String cycle;
	
    @Column(name = "date_created")
	private Date dateCreated;
	
    @Column(name = "cycle_start_date")
	private Date cycleStartDate;
	
    @Column(name = "creator")
	private User creator;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCycle() {
		return cycle;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public Date getCycleStartDate() {
		return cycleStartDate;
	}

	public User getCreator() {
		return creator;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public void setCycleStartDate(Date cycleStartDate) {
		this.cycleStartDate = cycleStartDate;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	@Override
	public String toString() {
		return String.format("Project [id=%s, name=%s, cycle=%s, dateCreated=%s, cycleStartDate=%s, creator=%s]", id,
				name, cycle, dateCreated, cycleStartDate, creator);
	}
    
    
	
}
