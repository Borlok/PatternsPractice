package com.borlok.patternspractice.behaviorpatterns.visitor;

public class CityRoad implements Movement {
    @Override
    public void go(Car car) {
        car.go(this);
    }
}
