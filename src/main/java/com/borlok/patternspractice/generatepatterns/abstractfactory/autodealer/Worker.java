package com.borlok.patternspractice.generatepatterns.abstractfactory.autodealer;

import com.borlok.patternspractice.generatepatterns.abstractfactory.Employee;

public class Worker implements Employee {
    @Override
    public void work() {
        System.out.println("Обслуживает авто");
    }
}
