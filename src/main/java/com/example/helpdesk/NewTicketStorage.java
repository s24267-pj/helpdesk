package com.example.helpdesk;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class NewTicketStorage {

    private List<NewTicket> newTicketList = new ArrayList<>();


    public List<NewTicket> getNewTicketList() {
        return newTicketList;
    }

    public NewTicketStorage() {
        newTicketList.add(new NewTicket(new User("Alicja"), new Ticket(1, "Nie działa", Status.Open)));

    }
}
