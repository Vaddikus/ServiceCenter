package week3.mvc.model.human;

import week3.mvc.model.repair.Ticket;

import java.time.LocalDate;
import java.util.List;

public class Worker {

    private String name;
    private String phoneNumber;
    private List<Ticket> tickets;
    private double salary;
    private LocalDate startWorkDate;

    public Worker(String name, String phoneNumber, double salary) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.startWorkDate = LocalDate.now();
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getStartWorkDate() {
        return startWorkDate;
    }

}
