package com.example.helpdesk;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TicketService {
    private TicketStorage ticketStorage;


    public TicketService(TicketStorage ticketStorage) {
        this.ticketStorage = ticketStorage;
    }

    public List<Ticket> getAllTickets() {
        return ticketStorage.getTicketList();
    }

    public void createNewTicket(User user, Employee employee, Status status) {
        ticketStorage.getTicketList().add(new Ticket(user, employee, status));
    }


}
