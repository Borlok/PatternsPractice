package com.borlok.patternspractice.structurepatterns.Bridge;

public class CommonCar extends TaxiPool {

    public CommonCar(Driver driver) {
        super(driver);
    }

    @Override
    protected void provideCar() {
        System.out.println("Предоставленно обычное авто");
        driver.drive();
    }
}
