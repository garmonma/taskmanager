package com.nni.taskmanager.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feature")
public class Feature {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
