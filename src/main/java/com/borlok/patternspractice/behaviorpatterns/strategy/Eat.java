package com.borlok.patternspractice.behaviorpatterns.strategy;

public class Eat implements Action {
    @Override
    public void action() {
        System.out.println("Кушаем");
    }
}
