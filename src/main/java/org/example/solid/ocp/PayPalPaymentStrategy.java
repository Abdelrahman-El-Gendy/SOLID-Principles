package org.example.solid.ocp;

public class PayPalPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment(Double amount) {
        System.out.println("Processing PayPal Payment...");

    }
}
