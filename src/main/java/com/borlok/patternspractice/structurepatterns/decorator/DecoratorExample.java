package com.borlok.patternspractice.structurepatterns.decorator;

public class DecoratorExample {
    public DecoratorExample() {
        Car car = new SuperCar(new FastCar(new SlowCar()));

        System.out.println(car.go());
    }
}
