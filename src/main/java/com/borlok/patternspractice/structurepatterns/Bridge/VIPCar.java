package com.borlok.patternspractice.structurepatterns.Bridge;

public class VIPCar extends TaxiPool {
    public VIPCar(Driver driver) {
        super(driver);
    }

    @Override
    protected void provideCar() {
        System.out.println("Предоставленно вип авто");
        driver.drive();
    }
}
