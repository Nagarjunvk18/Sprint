package com.tres.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="reservations")
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long reservationNumber;

	private LocalDateTime reservationTime;

	@ManyToOne
    @JoinColumn(name = "train_id")
    private Train train;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "schedule_id")
	private Schedule schedule;

	@ManyToOne
	@JoinColumn(name="coach_id")
	private Coach coach;
	
	@ManyToOne
	@JoinColumn(name = "seat_id")
	private Seat seat;

	@OneToMany(mappedBy = "reservation", cascade = CascadeType.ALL)
	private List<Passenger> passengers;

	@OneToOne(mappedBy = "reservation", cascade = CascadeType.ALL)
	private Payment payment;

}
