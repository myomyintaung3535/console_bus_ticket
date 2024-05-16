package com.bus.ticket.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.bus.ticket.dto.Gender;
import com.bus.ticket.dto.Ticket;
import com.bus.ticket.dto.TicketBooking;
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
		int personCount = InputUtils.getNumber("Person : ");

		List<Ticket> ticketList = ticketService.findTicket(from, to, date);
		PrintUtils.printTicket(ticketList, date, personCount);
		bookTicket(personCount, ticketList,date);
	}

	private void bookTicket(int personCount, List<Ticket> ticketList,LocalDate date) {
		TicketBooking ticketBooking = new TicketBooking();
		ticketBooking.setTicket(ticketList.get(InputUtils.getNumber("Select Ticket") - 1));
		ticketBooking.setPassengerName(InputUtils.getString("Enter Passenger Name : "));
		ticketBooking.setPhone(InputUtils.getString("Enter Phone Number :"));
		Arrays.stream(Gender.values()).forEach(System.out::print);
		ticketBooking.setGender(Gender.values()[InputUtils.getNumber("Select Gender : ") - 1]);
		PrintUtils.printTicketBooking(ticketBooking, personCount, date);
	}

}
