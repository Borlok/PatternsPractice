package com.borlok.patternspractice.structurepatterns.proxy;

public class ProxyExample {
    public ProxyExample() {
        Car opel = new ProxyCar(true);
        opel.run();
    }
}
