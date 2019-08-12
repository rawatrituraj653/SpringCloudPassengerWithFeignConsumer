package com.my.trip.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.trip.model.Ticket;
import com.my.trip.rest.consumer.TicketFeignConsumer;

@RestController
@RequestMapping("/pass")
public class PassengerRestController {

	@Autowired
	private TicketFeignConsumer consumer;
	
	@GetMapping(value="/getTicket")
	public Ticket GetTicket() {
		
		Ticket ticket= consumer.getTicket();
		return ticket;
	}
	
	@GetMapping("/all")
	public List<Ticket> getAll(){
		
		List<Ticket> ticket=consumer.getAllTicket();
		return ticket;
	}
}
