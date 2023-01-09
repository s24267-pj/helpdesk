package com.example.helpdesk;

public class NewTicket {
    private User user;
    private Ticket ticket;
    private Employee employee;

    public NewTicket(User user, Ticket ticket){
        this.user = user;
        this.ticket = ticket;
        //this.employee = employee;
    }
}
