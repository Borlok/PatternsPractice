package com.borlok.patternspractice.behaviorpatterns.interpretator;

public class CheckerDown implements AgeChecker{
    private final int age;

    public CheckerDown(int age) {
        this.age = age;
    }

    @Override
    public boolean checkAge(int age) {
        return this.age >= age;
    }
}
