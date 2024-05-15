package com.bus.ticket.repository;

import java.time.LocalDate;
import java.util.List;

import com.bus.ticket.dto.Ticket;

public interface TicketRepository {

	List<Ticket> findTicket(String from, String to, LocalDate date);

	Ticket findTicketById(int id);

	List<Ticket> findAllTicket();

}
