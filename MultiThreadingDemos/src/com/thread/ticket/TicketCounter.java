package com.thread.ticket;

public class TicketCounter {
	double totalTicketPrice;

	int totalTicketsAvailable;

	public TicketCounter(int totalTickets) {
		super();
		this.totalTicketsAvailable = totalTickets;
	}

	double bookTicket(String name, int noOfTickets, String bookingClass) {
		System.out.println("Passenger Name: " + name);
		
		
		if (totalTicketsAvailable > noOfTickets) {
			switch (bookingClass) {
			case "A": {
				totalTicketPrice = 300 * noOfTickets;
				break;
			}
			case "B": {
				totalTicketPrice = 200 * noOfTickets;
				break;
			}
			case "C": {
				totalTicketPrice = 100 * noOfTickets;
				break;
			}
			}
		} else {
			totalTicketPrice = 0;
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		totalTicketsAvailable = totalTicketsAvailable - noOfTickets;
		System.out.println("Name :" + name);
		System.out.println("Booking Class :" + bookingClass);
		System.out.println("Total ticket booked :" + noOfTickets);
		if (totalTicketPrice > 0)
			System.out.println("Total amount to be paid :" + totalTicketPrice);
		return totalTicketPrice;

	}
}
