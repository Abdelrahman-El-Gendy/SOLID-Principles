package org.example.solid.dip;

public class OrderManagementService {

    public DataProvider dataProvider;

    void BusinessLogic(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    void doBusinessLogic() {
        dataProvider.fetchData();
        // Other Business Logic
    }

}
