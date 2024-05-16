package com.bus.ticket.dto;

import java.time.LocalTime;

public class Ticket {

	private int id;
	private Bus bus;
	private Route route;
	private int price;
	private LocalTime time;

	public Ticket() {
	}

	public Ticket(int id, Bus bus, Route route, int price, LocalTime time) {
		super();
		this.id = id;
		this.bus = bus;
		this.route = route;
		this.price = price;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

}
