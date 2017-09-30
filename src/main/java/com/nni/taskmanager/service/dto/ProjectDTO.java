package com.nni.taskmanager.service.dto;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.nni.taskmanager.domain.Project;


public class ProjectDTO {
	
	private Long id;

    @NotBlank
    @Size(min = 1, max = 100)
    private String name;

    @Size(max = 50)
    private String cycle;
    
    public ProjectDTO(){
    	
    }
    
    public ProjectDTO(Project project) {
        this(project.getId(), project.getName(), project.getCycle());
    }

    public ProjectDTO(Long id, String name, String cycle ) {
        this.id = id;
        this.cycle = cycle;
        this.name = name;
    }

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCycle() {
		return cycle;
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

	@Override
	public String toString() {
		return String.format("ProjectDTO [id=%s, name=%s, cycle=%s]", id, name, cycle);
	}
}