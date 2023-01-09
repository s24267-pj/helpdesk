package com.example.helpdesk;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TicketStorage {
    private Ticket badAccName = new Ticket(1, "Bad name for my account.", Status.Open);
    private Ticket notWorking = new Ticket(2, "This doesn't work for me", Status.Open);
    private Ticket plzHelp = new Ticket(3, "Dunno what I am doing :/", Status.Closed);


    private List<Ticket> ticketList = new ArrayList<>();


    public TicketStorage() {
        ticketList.add(badAccName);
        ticketList.add(notWorking);
        ticketList.add(plzHelp);
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }


}
