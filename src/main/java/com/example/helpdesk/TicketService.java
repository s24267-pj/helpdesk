package com.example.helpdesk;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TicketService {
    private TicketStorage ticketStorage;
    private NewTicketStorage newTicketStorage;

    public TicketService(TicketStorage ticketStorage, NewTicketStorage newTicketStorage) {
        this.ticketStorage = ticketStorage;
        this.newTicketStorage = newTicketStorage;
    }

    public List<Ticket> getAllTickets() {
        return ticketStorage.getTicketList();
    }

    public void createNewTicket(User user, Ticket ticket) {


    }


}
