package com.bus.ticket.util;

import java.time.LocalDate;
import java.util.Scanner;

public class InputUtils {

	private static Scanner scan = new Scanner(System.in);

	public static String getString(String message) {
		System.out.println(message);
		return scan.nextLine();
	}

	public static int getNumber(String message) {
		for (;;) {
			try {
				return Integer.parseInt(getString(message));
			} catch (Exception e) {
				System.err.println("Enter Only Digit !!");
			}
		}
	}

	public static LocalDate getDate(String message) {
		System.out.println("Date : yyyy-mm-dd");
		for (;;) {
			try {
				return LocalDate.parse(getString(message));
			} catch (Exception e) {
				System.err.println("Enter Date Correctly.!");
			}
		}

	}

}
