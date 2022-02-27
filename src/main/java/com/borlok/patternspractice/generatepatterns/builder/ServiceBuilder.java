package com.borlok.patternspractice.generatepatterns.builder;

public abstract class ServiceBuilder {
    private Service service;

    ServiceBuilder createService() {
        service = new Service();
        return this;
    }

    abstract ServiceBuilder buildName();
    abstract ServiceBuilder buildPrice();

    Service getService() {
        return service;
    }
}
