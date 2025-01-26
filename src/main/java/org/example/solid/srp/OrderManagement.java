package org.example.solid.srp;

import org.example.solid.Order;

public class OrderManagement {

    public void processOrder(Order order){
        System.out.println("Processing Order: " + order.getName() + "now...");
    }
}
