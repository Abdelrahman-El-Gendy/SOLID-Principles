package org.example.solid.isp;

public class Customer implements UserManagement, SubscriptionNotificationService {
    String name;
    String email;

    public Customer(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public void subscribeToNewProductsAvailability() {
        System.out.println("Subscribing to new products availability...");
    }

    @Override
    public void subscribeToSMSNotification() {
        System.out.println("Subscribing to new SMS notifications...");
    }

    @Override
    public void updateUserProfile(Customer customer) {
        System.out.println("Updating user profile " + customer.getName() + "....");
    }

    @Override
    public void changePassword(Customer customer, String newPassword) {
        System.out.println("Updating password " + newPassword + "....");
    }
}
