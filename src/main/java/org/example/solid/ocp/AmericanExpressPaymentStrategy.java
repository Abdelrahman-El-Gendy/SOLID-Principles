package org.example.solid.ocp;

public class AmericanExpressPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(Double amount) {
        System.out.println("Processing American Express card Payment...");
    }
}
