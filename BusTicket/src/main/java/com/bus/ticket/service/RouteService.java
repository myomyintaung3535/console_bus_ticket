package com.bus.ticket.service;

import java.util.List;

import com.bus.ticket.dto.Route;

public interface RouteService {

	List<Route> findAllRoute();
	
	List<Route> findRoute(String from, String to);
	
	Route findRouteById(int id);
	
}
