package org.example.solid.isp;

public interface UserManagement {

    void updateUserProfile(Customer customer);

    void changePassword(Customer customer, String newPassword);

}
