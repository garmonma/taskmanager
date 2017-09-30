package com.nni.taskmanager.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends AbstractAuditingEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	

}