package com.bus.ticket.service;

import java.util.List;

import com.bus.ticket.dto.Bus;

public interface BusService {

	Bus findBusById(int id);
	List<Bus> findAllBus();
}
