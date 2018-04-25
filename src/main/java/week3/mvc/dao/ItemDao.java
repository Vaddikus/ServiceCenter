package week3.mvc.dao;

import week3.mvc.model.repair.Item;
import week3.mvc.model.repair.Ticket;

public interface ItemDao {

    Item getItem(Item item);

    boolean setItemStatus(Item item, String status);

}
