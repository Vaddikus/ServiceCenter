package week3.mvc.controller;

import week3.mvc.dao.*;
import week3.mvc.db.DataBase;
import week3.mvc.view.AdminView;
import week3.mvc.view.UserView;
import week3.mvc.view.WorkerView;

public class ServiceFactory {

    static DataBase database;

    //VIEWS
    private static AdminView adminView;
    private static UserView userView;
    private static WorkerView workerView;

    //CONTROLLERS
    private static AdminController adminController;
    private static WorkerController workerController;
    private static UserController userController;
    private static ItemController itemController;
    private static TicketController ticketController;

    //DAO

    private static UserDao userDao;
    private static WorkerDao workerDao;
    private static TicketDao ticketDao;
    private static ItemDao itemDao;

    public static Object get(String parameter) {
        switch (parameter) {
            case "database":
                return database == null ? database = new DataBase() : database;
            case "adminView":
                return adminView == null ? adminView = new AdminView() : adminView;
            case "userView":
                return userView == null ? userView = new UserView() : userView;
            case "workerView":
                return workerView == null ? workerView = new WorkerView() : workerView;
            case "adminController":
                return adminController == null ? adminController = new AdminControllerImpl() : adminController;
            case "userController":
                return userController == null ? userController = new UserControllerImpl() : userController;
            case "workerController":
                return workerController == null ? workerController = new WorkerControllerImpl() : workerController;
            case "itemController":
                return itemController == null ? itemController = new ItemControllerImpl() : itemController;
            case "ticketController":
                return ticketController == null ? ticketController = new TicketControllerImpl() : ticketController;
            case "userDao":
                return  userDao == null ? userDao = new UserDaoImpl() : userDao;
            case "workerDao":
                return workerDao == null ? workerDao = new WorkerDaoImpl() : workerDao;
            case "ticketDao":
                return ticketDao == null ? ticketDao = new TicketDaoImpl() : ticketDao;
            case "itemDao":
                return itemDao == null ? itemDao = new ItemDaoImpl() : itemDao;
            default:
                return null;
        }

    }
}
