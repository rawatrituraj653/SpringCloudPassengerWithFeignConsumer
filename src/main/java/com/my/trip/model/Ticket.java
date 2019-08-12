package com.my.trip.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Ticket {

	private String pnr;
	private String trainName;
	private String passengerName;
	private double ticketPrice; 
}
