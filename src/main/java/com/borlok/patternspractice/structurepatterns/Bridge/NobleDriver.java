package com.borlok.patternspractice.structurepatterns.Bridge;

public class NobleDriver implements Driver{
    @Override
    public void drive() {
        System.out.println("Водитель едет медленно");
    }
}
