package com.borlok.patternspractice.structurepatterns.composite;

public class Director implements Employee{
    @Override
    public void work() {
        System.out.println("Директор следит за работой");
    }
}
