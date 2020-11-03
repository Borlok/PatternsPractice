package com.borlok.patternspractice.structurepatterns.decorator;

public class FastCar extends CarDecorator{
    public FastCar(Car car) {
        super(car);
    }

    public String goFast() {
        return "Может ехать очень быстро.";
    }

    @Override
    public String go() {
        return super.go()+goFast();
    }
}
