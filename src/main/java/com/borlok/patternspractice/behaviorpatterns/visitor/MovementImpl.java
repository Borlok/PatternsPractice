package com.borlok.patternspractice.behaviorpatterns.visitor;

public class MovementImpl implements Movement{
    private final Movement [] roadType;

    public MovementImpl() {
        this.roadType = new Movement[] {
                new Highway(),
                new OffRoad(),
                new CityRoad()
        };
    }

    @Override
    public void go(Car car) {
        for (Movement m : roadType)
            m.go(car);
    }
}
