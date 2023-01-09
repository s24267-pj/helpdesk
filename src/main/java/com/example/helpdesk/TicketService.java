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

    public void createNewTicket(int id, User user, Employee employee, Status status) {
        ticketStorage.getTicketList().add(new Ticket(id, user, employee, status));
        System.out.println("Użytkownik " + user.getName()
                + " stworzył nowy ticket." + System.lineSeparator()
                + "Został przydzielony pracownik " + employee.getName()
                + ".");
    }

    public void changeStatus(int id, Status status) {
        List<Ticket> ticketList = ticketStorage.getTicketList();

        for (Ticket ticket : ticketList) {
            if (id == ticket.getId()) {
                System.out.println("Ticket użytkownika " + ticket.getUser().getName()
                        + ", przypisany do pracownika " + ticket.getEmployee().getName()
                        + " zmiana statusu z " + ticket.getStatus().toString()
                        + " na " + status
                        + ".");
                ticket.setStatus(status);
            }
        }

    }


}
