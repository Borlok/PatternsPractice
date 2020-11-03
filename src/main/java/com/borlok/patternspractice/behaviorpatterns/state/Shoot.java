package com.borlok.patternspractice.behaviorpatterns.state;

public class Shoot implements Action{
    @Override
    public void action() {
        System.out.println("Стреляем");
    }
}
