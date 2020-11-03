package com.borlok.patternspractice.behaviorpatterns.interpretator;

public class InterpretationExample {
    public InterpretationExample() {
        AgeChecker checker1 = new CheckerUp(18);
        AgeChecker checker2 = new CheckerDown(35);
        AgeChecker andCheckAge = new AndCheckAge(checker1, checker2);
        AgeChecker orCheckAge2 = new OrCheckAge(checker1, checker1);

        System.out.println("Подходящий возраст: " + andCheckAge.checkAge(31));
        System.out.println("Подходящий возраст: " + orCheckAge2.checkAge(14));
    }
}
