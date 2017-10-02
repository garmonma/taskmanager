package com.nni.taskmanager.web.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nni.taskmanager.domain.Project;
import com.nni.taskmanager.repository.ProjectRepository;
import com.nni.taskmanager.service.ProjectService;
import com.nni.taskmanager.service.dto.ProjectDTO;
import com.nni.taskmanager.web.rest.util.HeaderUtil;

@CrossOrigin
@RestController
@RequestMapping("/api/project")
public class ProjectController {
	
	private static final String ENTITY_NAME = "projectManagement";
	
	private ProjectService projectService;
	
	private ProjectRepository projectRepository;
	
	public ProjectController(ProjectService projectService, ProjectRepository projectRepository) {
		this.projectService = projectService;
		this.projectRepository = projectRepository;
	}
	
	@GetMapping("/projects")
    public ResponseEntity<List<String>> getAllProjects() {
        List<String> projects = projectService.getAllProjectNames();
        return new ResponseEntity<>( projects, HttpStatus.OK);
    }
	
	@PostMapping("/create")
	public ResponseEntity<Project> createProject( @RequestBody ProjectDTO projectDTO) throws URISyntaxException{
		
		if (projectDTO.getId() != null) { 
            return ResponseEntity.badRequest()
                .headers(HeaderUtil.createFailureAlert(ENTITY_NAME, "idexists", "A new user cannot already have an ID"))
                .body(null);
        } else if (projectRepository.findOneByName(projectDTO.getName().toLowerCase()).isPresent()) {
            return ResponseEntity.badRequest()
                .headers(HeaderUtil.createFailureAlert(ENTITY_NAME, "userexists", "Login already in use"))
                .body(null);
        }  else {
            Project newProject = projectService.createProject(projectDTO);
            return ResponseEntity.created(new URI("/api/projects/" + newProject.getName()))
                .headers(HeaderUtil.createAlert( "A project is created with identifier " + newProject.getName(), newProject.getName()))
                .body(newProject);
        }
	}

}