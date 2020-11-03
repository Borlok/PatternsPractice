package com.borlok.patternspractice.behaviorpatterns.strategy;

public class StrategyExample {
    public StrategyExample() {
        Hunter hunter = new Hunter();

        hunter.setAction(new Eat());
        hunter.doAction();

        hunter.setAction(new Go());
        hunter.doAction();

        hunter.setAction(new Walk());
        hunter.doAction();

        hunter.setAction(new Shoot());
        hunter.doAction();
    }
}
