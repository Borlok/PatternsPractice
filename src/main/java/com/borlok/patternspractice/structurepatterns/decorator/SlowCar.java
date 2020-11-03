package com.borlok.patternspractice.structurepatterns.decorator;

public class SlowCar implements Car{
    @Override
    public String go() {
        return "Может ехать, и то хорошо.";
    }
}
