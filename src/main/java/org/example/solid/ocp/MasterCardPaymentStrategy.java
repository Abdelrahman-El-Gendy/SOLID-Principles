package org.example.solid.ocp;

public class MasterCardPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment(Double amount) {
        System.out.println("Processing Master card Payment...");

    }
}
