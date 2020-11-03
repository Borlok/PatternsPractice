package com.borlok.patternspractice.behaviorpatterns.strategy;

public class Shoot implements Action {
    @Override
    public void action() {
        System.out.println("Стреляем");
    }
}
