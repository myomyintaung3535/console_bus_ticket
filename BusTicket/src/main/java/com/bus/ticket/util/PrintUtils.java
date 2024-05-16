package com.bus.ticket.util;

import java.time.LocalDate;
import java.util.List;

import com.bus.ticket.dto.Ticket;
import com.bus.ticket.dto.TicketBooking;

public class PrintUtils {
	private static String messagePattern = "%4s %-6s : %-10s%n";
	private static String datePatten = "%4s %-6s : %tD%n";
	private static String timePattern = "%4s %-6s : %tl:%tM %tp%n";
	private static String digitPattern = "%4s %-6s : %d%n";

	public static void printWelcomeMessage() {
		System.out.println("=========== Welcome From Online Bus Ticket ===========");
	}

	public static void printTicket(List<Ticket> ticketList, LocalDate date, int personCount) {
		for (int i = 0; i < ticketList.size(); i++) {
			System.out.printf("%d. %-15s (%s)%n", (i + 1), ticketList.get(i).getBus().getBusLineName(),
					ticketList.get(i).getBus().getBusType());
			System.out.printf(messagePattern, "", "From", ticketList.get(i).getRoute().getFrom());
			System.out.printf(messagePattern, "", "To", ticketList.get(i).getRoute().getFrom());
			System.out.printf(datePatten, "", "Date", date);
			System.out.printf(timePattern, "", "Time", ticketList.get(i).getTime(), ticketList.get(i).getTime(),
					ticketList.get(i).getTime());
			System.out.printf(digitPattern, "", "Price", ticketList.get(i).getPrice() * personCount);
		}
	}

	public static void printTicketBooking(TicketBooking ticketBooking, int personCount, LocalDate date) {

		System.out.println("Check Booking");
		System.out.printf(messagePattern, "", "Name", ticketBooking.getPassengerName());
		System.out.printf(messagePattern, "", "Phone", ticketBooking.getPhone());
		System.out.printf(messagePattern, "", "Bus", ticketBooking.getTicket().getBus().getBusLineName());
		System.out.printf(messagePattern, "", "From", ticketBooking.getTicket().getRoute().getFrom());
		System.out.printf(messagePattern, "", "To", ticketBooking.getTicket().getRoute().getTo());
		System.out.printf(datePatten, "", "Date", date);
		System.out.printf(timePattern, "", "Time", ticketBooking.getTicket().getTime(),
				ticketBooking.getTicket().getTime(), ticketBooking.getTicket().getTime());
		System.out.printf(digitPattern,"","Person",personCount);
		System.out.printf(digitPattern, "", "Price", ticketBooking.getTicket().getPrice() * personCount);

	}

}
