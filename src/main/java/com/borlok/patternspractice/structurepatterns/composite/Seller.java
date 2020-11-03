package com.borlok.patternspractice.structurepatterns.composite;

public class Seller implements Employee{
    @Override
    public void work() {
        System.out.println("Продавец продает товары");
    }
}
