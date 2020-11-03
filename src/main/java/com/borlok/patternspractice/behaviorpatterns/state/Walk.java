package com.borlok.patternspractice.behaviorpatterns.state;

public class Walk implements Action{
    @Override
    public void action() {
        System.out.println("Гуляем");
    }
}
