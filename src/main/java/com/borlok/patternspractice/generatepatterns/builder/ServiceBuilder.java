package com.borlok.patternspractice.generatepatterns.builder;

public abstract class ServiceBuilder {
    private Service service;

    void createService() {
        service = new Service();
    }

    abstract void buildName();
    abstract void buildPrice();

    Service getService() {
        return service;
    }
}
