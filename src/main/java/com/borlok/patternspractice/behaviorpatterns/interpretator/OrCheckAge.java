package com.borlok.patternspractice.behaviorpatterns.interpretator;

public class OrCheckAge implements AgeChecker{
    private final AgeChecker checkerUp1;
    private final AgeChecker checkerUp2;

    public OrCheckAge(AgeChecker checkerUp1, AgeChecker checkerUp2) {
        this.checkerUp1 = checkerUp1;
        this.checkerUp2 = checkerUp2;
    }


    @Override
    public boolean checkAge(int age) {
        return checkerUp1.checkAge(age) || checkerUp2.checkAge(age);
    }
}
