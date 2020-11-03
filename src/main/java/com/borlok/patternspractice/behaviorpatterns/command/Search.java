package com.borlok.patternspractice.behaviorpatterns.command;

public class Search implements Action{
    @Override
    public void execute() {
        System.out.println("Алиса выполняет поиск");
    }
}
