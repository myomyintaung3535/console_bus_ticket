package com.bus.ticket.dto;

import java.time.LocalDateTime;

public class TicketBooking {

	private int id;
	private String passengerName;
	private String phone;
	private int personCount;
	private LocalDateTime time;
	private Ticket ticket;
	private Gender gender;

	public TicketBooking() {
	}

	public TicketBooking(int id, String passengerName, String phone, int personCount, LocalDateTime time, Ticket ticket,
			Gender gender) {
		super();
		this.id = id;
		this.passengerName = passengerName;
		this.phone = phone;
		this.personCount = personCount;
		this.time = time;
		this.ticket = ticket;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPersonCount() {
		return personCount;
	}

	public void setPersonCount(int personCount) {
		this.personCount = personCount;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
