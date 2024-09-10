package com.thread.ticket;

class Booking implements Runnable {

	String name;
	int noOfTickets;
	String bookingClass;
	Thread t;
	TicketCounter ticketCounter;

	public Booking(String name, int noOfTickets, String bookingClass, TicketCounter ticketCounter) {
		t = new Thread(this, name);
		this.name = name;
		this.noOfTickets = noOfTickets;
		this.bookingClass = bookingClass;
		this.ticketCounter = ticketCounter;
		t.start();
	}

	@Override
	public void run() {
		synchronized (ticketCounter) {
			System.out.println("Welcome to Ticket Booking Portal");
			double totalTicketCost = ticketCounter.bookTicket(name, noOfTickets, bookingClass);
			if (totalTicketCost > 0) {
				System.out.println("Total ticket Cost: " + totalTicketCost);
			} else {
				System.out.println("Tickets Sold out");
			}
		}
	}
}

public class Client {

	public static void main(String[] args) {

		TicketCounter ticketCounter = new TicketCounter(40);

		Booking bookingAclass = new Booking("Chaitu", 20, "A", ticketCounter);
		Booking bookingBclass = new Booking("Jaswik", 15, "B", ticketCounter);
		Booking bookingCclass = new Booking("Harini", 10, "C", ticketCounter);

	}

}
