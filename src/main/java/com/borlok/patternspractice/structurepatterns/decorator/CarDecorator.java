package com.borlok.patternspractice.structurepatterns.decorator;

public class CarDecorator implements Car{
    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String go() {
        return car.go();
    }
}
