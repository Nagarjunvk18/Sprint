package com.tres.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="trains")
public class Train {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trainNumber;
	
	private String trainName;
	
	@OneToMany(mappedBy="train")
	private List<Coach> coach;
	
	@OneToMany(mappedBy = "train", cascade = CascadeType.ALL)
	private List<Reservation> reservations;

}
