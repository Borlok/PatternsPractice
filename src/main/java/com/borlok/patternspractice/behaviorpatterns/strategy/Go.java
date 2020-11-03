package com.borlok.patternspractice.behaviorpatterns.strategy;

public class Go implements Action {
    @Override
    public void action() {
        System.out.println("Идем");
    }
}
