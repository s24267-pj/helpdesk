package com.example.helpdesk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelpdeskApplication {

    private TicketService ticketService;

    public HelpdeskApplication(TicketService ticketService) {
        this.ticketService = ticketService;

        ticketService.createNewTicket(3, new User("Radek_user"), new Employee("Ania_pracownik"), Status.Open);
        ticketService.changeStatus(1, Status.Closed);
    }

    public static void main(String[] args) {
        SpringApplication.run(HelpdeskApplication.class, args);
    }

}
