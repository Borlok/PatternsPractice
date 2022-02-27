package com.borlok.patternspractice.generatepatterns.builder;

public class CouchServiceBuilder extends ServiceBuilder{

    @Override
    CouchServiceBuilder buildName() {
        getService().setServiceName("Обучение");
        return this;
    }

    @Override
    CouchServiceBuilder buildPrice() {
        getService().setPrice(50000);
        return this;
    }
}
