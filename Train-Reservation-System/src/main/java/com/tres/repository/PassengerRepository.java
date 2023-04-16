package com.tres.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tres.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer>{

}
