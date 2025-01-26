package org.example.solid.ocp;

public class VisaPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(Double amount) {
        System.out.println("Processing Visa card Payment...");
    }
}
