package org.example.solid.isp;

public class Subscriber implements SubscriptionNotificationService {

    String email;

    public String getEmail() {
        return email;
    }

    @Override
    public void subscribeToNewProductsAvailability() {
        System.out.println("Subscribing to new products availability...");
    }

    @Override
    public void subscribeToSMSNotification() {
        System.out.println("Subscribing to new SMS notifications...");
    }

}
