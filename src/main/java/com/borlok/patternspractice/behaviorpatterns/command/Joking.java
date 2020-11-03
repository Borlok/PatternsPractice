package com.borlok.patternspractice.behaviorpatterns.command;

public class Joking implements Action{

    @Override
    public void execute() {
        System.out.println("Алиса шутит");
    }
}
