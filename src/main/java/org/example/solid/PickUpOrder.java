package org.example.solid;

import org.example.solid.lsp.ShippingCostCalculator;

public class PickUpOrder extends Order implements ShippingCostCalculator {


    @Override
    public double calculateShippingCost() {
        return price;
    }
}
