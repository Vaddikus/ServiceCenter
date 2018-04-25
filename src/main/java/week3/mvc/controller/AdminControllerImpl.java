package week3.mvc.controller;

import week3.mvc.dao.*;
import week3.mvc.model.human.Worker;
import week3.mvc.model.repair.Ticket;

import java.util.List;
import java.util.Map;

public class AdminControllerImpl implements AdminController {

    //DAO for work with database
    LogDao logDao;
    TicketDao ticketDao;
    UserDao userDao;
    WorkerDao workerDao;

    public AdminControllerImpl(){
        ticketDao = (TicketDao) ServiceFactory.get("ticketDao");
        userDao = (UserDao) ServiceFactory.get("userDao");
        workerDao = (WorkerDao) ServiceFactory.get("workerDao");
    }

    public boolean hireWorker(Worker worker) {
        System.out.printf("Worker %s is hired.\n", worker.getName());
        return workerDao.createWorker(worker);
    }

    public Worker fireWorker(Worker worker) {
        return workerDao.deleteWorker(worker);
    }

    public void paySalary() {

    }

    public Map<Worker, Double> getSalaryInfoByWorkers() {

        return null;
    }

    public int getWorkedHoursByWorker(Worker worker) {

        return 0;
    }

    public List<Worker> getInvolvedWorkers() {

        return null;
    }

    public List<Ticket> getclosedTickets() {

        return null;
    }

    public List<Ticket> getOpenTickets() {

        return null;
    }

}
