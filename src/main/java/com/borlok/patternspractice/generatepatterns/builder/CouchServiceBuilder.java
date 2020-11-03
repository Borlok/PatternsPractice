package com.borlok.patternspractice.generatepatterns.builder;

public class CouchServiceBuilder extends ServiceBuilder{

    @Override
    void buildName() {
        getService().setServiceName("Обучение");
    }

    @Override
    void buildPrice() {
        getService().setPrice(50000);
    }
}
