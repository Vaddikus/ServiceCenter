package week3.mvc.dao;

import week3.mvc.controller.ServiceFactory;
import week3.mvc.db.DataBase;
import week3.mvc.model.repair.Item;

public class ItemDaoImpl implements ItemDao {

    DataBase database;

    public ItemDaoImpl(){
        database = (DataBase) ServiceFactory.get("database");
    }

    public Item getItem(Item item) {
        return null;
    }

    public boolean setItemStatus(Item item, String status) {
        return false;
    }
}
