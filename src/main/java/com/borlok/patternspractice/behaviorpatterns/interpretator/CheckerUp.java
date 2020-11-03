package com.borlok.patternspractice.behaviorpatterns.interpretator;

public class CheckerUp implements AgeChecker {
    private int age;

    public CheckerUp(int age) {
        this.age = age;
    }

    @Override
    public boolean checkAge(int age) {
        return this.age <= age;
    }
}
