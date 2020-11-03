package com.borlok.patternspractice.behaviorpatterns.strategy;

public class Walk implements Action {
    @Override
    public void action() {
        System.out.println("Гуляем");
    }
}
