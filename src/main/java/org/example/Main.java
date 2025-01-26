package org.example;

import org.example.solid.Order;
import org.example.solid.ocp.PayPalPaymentStrategy;
import org.example.solid.ocp.VisaPaymentStrategy;
import org.example.solid.srp.PaymentProcessor;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new VisaPaymentStrategy());
        paymentProcessor.processPayment(new Order());
    }
}