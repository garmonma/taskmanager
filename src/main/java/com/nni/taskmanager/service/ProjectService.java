package com.nni.taskmanager.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nni.taskmanager.domain.Project;
import com.nni.taskmanager.repository.ProjectRepository;
import com.nni.taskmanager.service.dto.ProjectDTO;

@Service
@Transactional
public class ProjectService {

	private ProjectRepository projectRepository;

	public ProjectService(ProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}

	public List<String> getAllProjectNames() {
		return projectRepository.findAll().stream().map(Project::getName).collect(Collectors.toList());
	}

	public Project createProject(ProjectDTO projectDTO) {
		Project project = new Project();
		
		project.setName(projectDTO.getName());
		project.setCycle(projectDTO.getCycle());
		
		projectRepository.save(project);
		return project;
	}
}