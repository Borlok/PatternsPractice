package com.borlok.patternspractice.structurepatterns.flyweight;

public class Director implements Employee {
    @Override
    public void work() {
        System.out.println("Следить за порядком");
    }
}
