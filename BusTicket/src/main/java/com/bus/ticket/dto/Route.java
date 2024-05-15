package com.bus.ticket.dto;

public class Route {

	private int id;
	private String from;
	private String to;

	public Route() {
	}

	public Route(int id, String from, String to) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

}
