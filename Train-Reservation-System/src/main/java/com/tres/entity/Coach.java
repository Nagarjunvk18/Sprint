package com.tres.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="coachs")
public class Coach {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String coachNumber;

	private Integer totalSeats;

	@ManyToOne
	@JoinColumn(name = "train_id")
	private Train train;

	@OneToMany(mappedBy = "coach")
	private List<Reservation> reservations;

	@OneToMany(mappedBy = "coach", cascade = CascadeType.ALL)
	private List<Seat> seat;

}
