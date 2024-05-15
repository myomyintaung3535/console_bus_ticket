package com.bus.ticket.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("unused")
public class TicketBooking {
	private int id;
	private String passengerName;
	private String phone;
	private LocalDateTime time;
	private Ticket ticket;
	
}
