package com.tres.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tres.entity.Seat;

public interface SeatRepository extends JpaRepository<Seat, Integer>{

}
