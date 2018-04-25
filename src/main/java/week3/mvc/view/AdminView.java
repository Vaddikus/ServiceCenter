package week3.mvc.view;

import week3.mvc.controller.AdminController;
import week3.mvc.controller.LoginController;
import week3.mvc.controller.ServiceFactory;
import week3.mvc.model.human.User;
import week3.mvc.model.human.Worker;
import week3.mvc.model.repair.Ticket;

import java.util.List;
import java.util.Map;

public class AdminView {
    LoginController loginController;
    AdminController adminController;
    List<User> users;
    List<Worker> workers;
    List<Ticket> tickets;

    public AdminView(){
        adminController = (AdminController) ServiceFactory.get("adminController");

    }


    public boolean login(){
        return false;
    }

    public boolean hireWorker(Worker worker){

        return adminController.hireWorker(worker);

    }
    public Worker fireWorker(Worker worker) throws Exception {

        if (adminController.fireWorker(worker) != null)
            return worker;
        throw new Exception("There is no such worker in database");

    }
    public void paySalary() {
        adminController.paySalary();
    }

    public Map<Worker, Double> getSalaryInfoByWorkers() {

        return adminController.getSalaryInfoByWorkers();
    }

    public int getWorkedHoursByWorker(Worker worker) {

        return adminController.getWorkedHoursByWorker(worker);
    }


    public List<Worker> getInvolvedWorkers() {

        return adminController.getInvolvedWorkers();
    }

    public List<Ticket> getclosedTickets() {

        return adminController.getclosedTickets();
    }

    public List<Ticket> getOpenTickets() {

        return adminController.getOpenTickets();
    }
}
