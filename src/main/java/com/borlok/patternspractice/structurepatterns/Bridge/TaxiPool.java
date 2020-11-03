package com.borlok.patternspractice.structurepatterns.Bridge;

public abstract class TaxiPool {
    protected Driver driver;

    public TaxiPool(Driver driver) {
        this.driver = driver;
    }

    protected abstract void provideCar();
}
