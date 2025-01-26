package org.example.solid.ocp;

//Open-Closed Principle ->
// Software Entities(Class , Methods ..etc) should be Open for Extension Closed for modification
public interface PaymentStrategy {

    void processPayment(Double amount);
}
