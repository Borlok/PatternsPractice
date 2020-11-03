package com.borlok.patternspractice.generatepatterns.builder;

public class RepairServiceBuilder extends ServiceBuilder{
    @Override
    void buildName() {
        getService().setServiceName("Ремонт");
    }

    @Override
    void buildPrice() {
        getService().setPrice(300000);
    }
}
