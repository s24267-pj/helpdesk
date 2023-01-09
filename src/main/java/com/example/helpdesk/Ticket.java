package com.example.helpdesk;

public class Ticket {
    private int id;
    private User user;
    private Employee employee;
    private Status status;

    public Ticket(int id, User user, Employee employee, Status status) {
        this.id = id;
        this.user = user;
        this.employee = employee;
        this.status = status;

    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
