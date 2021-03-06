package week3.mvc.controller;

import week3.mvc.model.human.Worker;
import week3.mvc.model.repair.Ticket;

import java.util.List;
import java.util.Map;

public interface AdminController {

    boolean hireWorker(Worker worker);

    Worker fireWorker(Worker worker);

    void paySalary();

    Map<Worker, Double> getSalaryInfoByWorkers();

    int getWorkedHoursByWorker(Worker worker);

    List<Worker> getInvolvedWorkers();

    List<Ticket> getclosedTickets();

    List<Ticket> getOpenTickets();

}
