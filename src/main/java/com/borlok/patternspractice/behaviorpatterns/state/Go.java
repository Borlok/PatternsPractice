package com.borlok.patternspractice.behaviorpatterns.state;

public class Go implements Action{
    @Override
    public void action() {
        System.out.println("Идем");
    }
}
