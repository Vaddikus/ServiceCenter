package week3.mvc.controller;

import week3.mvc.model.repair.Item;

public interface ItemController {

    boolean isItemFixed(Item item);

    boolean setItemStatus(Item item, String status);
}
