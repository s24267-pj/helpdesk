package com.example.helpdesk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelpdeskApplication {

    private TicketService ticketService;

    public HelpdeskApplication(TicketService ticketService) {
        this.ticketService = ticketService;

        ticketService.createNewTicket(new User("Radek_user"), new Employee("Ania_pracownik"), Status.Open);
        System.out.println(ticketService.getAllTickets().toString());

    }

    public static void main(String[] args) {
        SpringApplication.run(HelpdeskApplication.class, args);
    }

}
