package com.borlok.patternspractice.structurepatterns.Bridge;

public class BridgeExample {
    public BridgeExample() {
        TaxiPool [] cars = {
                new VIPCar(new ProfessionalDriver()),
                new CommonCar(new NobleDriver())
};
        for (TaxiPool car : cars) {
            car.provideCar();
            System.out.println();
        }
    }
}
