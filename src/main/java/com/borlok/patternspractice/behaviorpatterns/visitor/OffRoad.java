package com.borlok.patternspractice.behaviorpatterns.visitor;

public class OffRoad implements Movement{
    @Override
    public void go(Car car) {
        car.go(this);
    }
}
