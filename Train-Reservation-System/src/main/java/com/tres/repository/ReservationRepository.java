package com.tres.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tres.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer>{

}
