package com.borlok.patternspractice.behaviorpatterns.command;

public class Advise implements Action{

    @Override
    public void execute() {
        System.out.println("Алиса дает советы");
    }
}
