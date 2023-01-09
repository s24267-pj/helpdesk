package com.example.helpdesk;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TicketStorage {
    private Ticket alicja = new Ticket(1, new User("Alicja_user"), new Employee("Darek_pracownik"), Status.Open);
    private Ticket patrycja = new Ticket(2, new User("Patrycja_user"), new Employee("Igor_pracownik"), Status.Closed);

    private List<Ticket> ticketList = new ArrayList<>();

    public TicketStorage() {
        ticketList.add(alicja);
        ticketList.add(patrycja);
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }
}
