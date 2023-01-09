package com.example.helpdesk;

public class Ticket {
    private int id;
    private String message;
    private Status status;

    public Ticket(int id, String message, Status status) {
        this.id = id;
        this.message = message;
        this.status = status;

    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}
