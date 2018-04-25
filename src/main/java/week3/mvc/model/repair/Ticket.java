package week3.mvc.model.repair;

import week3.mvc.model.human.Worker;

public class Ticket {

    private Item item;
    private static int counter = 0;
    private int id;
    private String status;
    private int fixHours;
    private Worker worker;

    public Ticket(Item item, int fixHours) {
        this.item = item;
        this.fixHours = fixHours;
        id = ++counter;
        status = "open";
    }


    public int getFixHours() {
        return fixHours;
    }

    public void setFixHours(int fixHours) {
        this.fixHours = fixHours;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
