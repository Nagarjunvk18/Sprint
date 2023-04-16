package com.tres.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tres.entity.Train;

public interface TrainRepository extends JpaRepository<Train, Integer> {

}
