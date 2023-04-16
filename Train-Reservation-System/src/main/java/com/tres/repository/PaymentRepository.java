package com.tres.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tres.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
