package com.my.trip.rest.consumer;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import com.my.trip.model.Ticket;


@FeignClient("TICKET-PROD")
public interface TicketFeignConsumer {

	@GetMapping(value="/ticket/getTicket",produces = MediaType.APPLICATION_XML_VALUE)
	public Ticket getTicket();
	
	
	@GetMapping(value="/ticket/getAllTicket")
	public List<Ticket> getAllTicket();
}
