package com.borlok.patternspractice.generatepatterns.abstractfactory.autodealer;

import com.borlok.patternspractice.generatepatterns.abstractfactory.Accountant;

public class Bookkeeper implements Accountant {
    @Override
    public void countMoney() {
        System.out.println("Считает деньги, дебет, кредит, теряет цифры, ищет цифры.");
    }
}
