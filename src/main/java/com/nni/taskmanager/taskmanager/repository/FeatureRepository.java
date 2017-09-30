package com.nni.taskmanager.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nni.taskmanager.taskmanager.domain.Feature;

public interface FeatureRepository extends JpaRepository<Feature, Long> {

}
