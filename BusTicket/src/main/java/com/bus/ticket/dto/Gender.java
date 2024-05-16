package com.bus.ticket.dto;

public enum Gender {

	Male, Female, MixGroup;

	@Override
	public String toString() {
		return String.format("%d. %s%n", (ordinal() + 1), name());
	}

}
