package com.borlok.patternspractice.generatepatterns.abstractfactory.Instrumentalshop;

import com.borlok.patternspractice.generatepatterns.abstractfactory.Accountant;

public class ResourcesManager implements Accountant {
    @Override
    public void countMoney() {
        System.out.println("Распределяет ресурсы куда надо, пашет за директора");
    }
}
