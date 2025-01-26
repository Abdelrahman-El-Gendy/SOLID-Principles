package org.example.solid;

import org.example.solid.lsp.ShippingCostCalculator;

public class DeliveryOrder extends Order implements ShippingCostCalculator {

    @Override
    public double calculateShippingCost() {
        return price + SHIPPING_COST;
    }
}
