package com.bus.ticket.repository;

import java.util.List;

import com.bus.ticket.dto.Bus;

public interface BusRepository {
	
	Bus findById(int id);
	
	List<Bus> findAllBus();
	

}
