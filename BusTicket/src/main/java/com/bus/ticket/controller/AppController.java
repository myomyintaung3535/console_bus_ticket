package com.bus.ticket.controller;

import java.time.LocalDate;
import java.util.List;

import com.bus.ticket.dto.Ticket;
import com.bus.ticket.service.TicketService;
import com.bus.ticket.service.TicketServiceImpl;
import com.bus.ticket.util.InputUtils;
import com.bus.ticket.util.PrintUtils;

public class AppController {

	private TicketService ticketService;

	public AppController() {
		ticketService = TicketServiceImpl.getInstance();
	}

	public void start() {
		PrintUtils.printWelcomeMessage();
		searchTicket();
	}

	private void searchTicket() {
		String from = InputUtils.getString("From : ");
		String to = InputUtils.getString("To : ");
		LocalDate date = InputUtils.getDate("Date : ");
		int count = InputUtils.getNumber("Person : ");
		List<Ticket> ticketList = ticketService.findTicket(from, to, date);
		PrintUtils.printTicket(ticketList,date);
		
	}
}
