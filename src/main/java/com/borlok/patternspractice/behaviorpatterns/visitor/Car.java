package com.borlok.patternspractice.behaviorpatterns.visitor;

public interface Car {
    void go(Highway highway);
    void go(OffRoad offRoad);
    void go(CityRoad cityRoad);
}
