package org.example.solid.srp;

import org.example.solid.Order;
import org.example.solid.ocp.PaymentStrategy;

// Single Responsibility Principle (SRP) -> class has only one reason to change.
public class PaymentProcessor {

    private final PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(Order order) {
        System.out.println("Processing Payment for Order: " + order.getName());
        System.out.println("Issuing Payment for amount: " + order.getTotalPrice());
        paymentStrategy.processPayment(order.getTotalPrice());
    }
}
