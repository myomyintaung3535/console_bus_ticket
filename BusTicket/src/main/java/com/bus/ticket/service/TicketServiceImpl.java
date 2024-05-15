package com.bus.ticket.service;

import java.time.LocalDate;
import java.util.List;

import com.bus.ticket.dto.Ticket;
import com.bus.ticket.repository.TicketRepoImpl;
import com.bus.ticket.repository.TicketRepository;

public class TicketServiceImpl implements TicketService {
	
	private static TicketServiceImpl instance;
	private TicketRepository repo;

	private TicketServiceImpl() {
		repo = TicketRepoImpl.getInstance();
	}

	public static TicketServiceImpl getInstance() {
		return instance = instance != null ? instance : new TicketServiceImpl();
	}

	@Override
	public Ticket findTicketById(int id) {
		return repo.findTicketById( id);
	}

	@Override
	public List<Ticket> findTicket(String from, String to, LocalDate date) {
		return repo.findTicket(from, to, date);
	}

	@Override
	public List<Ticket> findAllTicket() {
		return repo.findAllTicket();
	}

}
