package com.borlok.patternspractice.behaviorpatterns.state;

public class Eat implements Action{
    @Override
    public void action() {
        System.out.println("Кушаем");
    }
}
