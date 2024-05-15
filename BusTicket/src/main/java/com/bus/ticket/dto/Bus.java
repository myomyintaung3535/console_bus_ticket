package com.bus.ticket.dto;

public class Bus {

	private int id;
	private String busLineName;
	private String busType;

	public Bus() {
		// TODO Auto-generated constructor stub
	}

	public Bus(int id, String busLineName, String busType) {
		super();
		this.id = id;
		this.busLineName = busLineName;
		this.busType = busType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBusLineName() {
		return busLineName;
	}

	public void setBusLineName(String busLineName) {
		this.busLineName = busLineName;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

}
