package org.example.solid.srp;

import org.example.solid.isp.Customer;

public class NotificationService {

    public void sendEmailNotification(Customer customer, String message) {
        System.out.println("Sending email notification to: " + customer.getEmail() +
                "with message: " + message);
    }

}
