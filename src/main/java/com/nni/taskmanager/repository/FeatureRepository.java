package com.nni.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nni.taskmanager.domain.Feature;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, Long> {

}
