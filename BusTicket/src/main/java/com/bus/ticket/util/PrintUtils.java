package com.bus.ticket.util;

import java.time.LocalDate;
import java.util.List;

import com.bus.ticket.dto.Ticket;

public class PrintUtils {

	public static void printWelcomeMessage() {
		System.out.println("=========== Welcome From Online Bus Ticket ===========");
	}

	public static void printTicket(List<Ticket> ticketList, LocalDate date) {
		for (int i = 0; i < ticketList.size(); i++) {
			System.out.printf("%d. %-15s (%s)%n", (i + 1), ticketList.get(i).getBus().getBusLineName(),
					ticketList.get(i).getBus().getBusType());
			System.out.printf("%4s %-6s : %-10s%n", " ", "From", ticketList.get(i).getRoute().getFrom());
			System.out.printf("%4s %-6s : %-10s%n", " ", "To", ticketList.get(i).getRoute().getFrom());
			System.out.printf("%4s %-6s : %tD%n", "", "Date", date);
			System.out.printf("%4s %-6s : %d%n", "", "Price", ticketList.get(i).getPrice());
		}
	}

}
