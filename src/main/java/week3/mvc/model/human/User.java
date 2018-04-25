package week3.mvc.model.human;

import week3.mvc.model.repair.Ticket;

import java.util.List;

public class User {

    private String name;
    private String phoneNumber;
    private List<Ticket> tickets;

    public User(String name, String phoneNumber, Ticket ticket){
        this.name = name;
        this.phoneNumber = phoneNumber;
        tickets.add(ticket);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Ticket> getTickets() {

        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }


}
