package com.borlok.patternspractice.behaviorpatterns.visitor;

public class Highway implements Movement{
    @Override
    public void go(Car car) {
        car.go(this);
    }
}
