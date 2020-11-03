package com.borlok.patternspractice.structurepatterns.decorator;

public class SuperCar extends CarDecorator{

    public SuperCar(Car car) {
        super(car);
    }

    String goVeryFast() {
        return "Практически летит.";
    }

    @Override
    public String go() {
        return super.go()+goVeryFast();
    }
}
