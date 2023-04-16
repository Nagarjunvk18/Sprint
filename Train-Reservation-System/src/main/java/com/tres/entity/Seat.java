package com.tres.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="seats")
public class Seat {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seatNumber;
    
	@ManyToOne
    private Coach coach;
        
    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;
    
    @OneToOne(mappedBy = "seat")
    private Reservation reservation;
    
}

