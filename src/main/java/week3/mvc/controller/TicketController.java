package week3.mvc.controller;

import week3.mvc.model.repair.Ticket;

import java.util.List;

public interface TicketController {

    Ticket createTicket();

    List<Ticket> getOpenTickets();

    Ticket getNextOpenTicket();

    List<Ticket> getClosedTickets();

    List<Ticket> getAllTickets();

    boolean updateTicket();

    boolean closeTicket();

}
