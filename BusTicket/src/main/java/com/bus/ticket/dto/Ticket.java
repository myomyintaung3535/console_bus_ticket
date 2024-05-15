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
public class Ticket {

	private int id;
	private Bus bus;
	private Route route;
	private int price;
	private LocalDateTime time;
	
}
