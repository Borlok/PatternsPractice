package com.borlok.patternspractice.generatepatterns.builder;

public class RepairServiceBuilder extends ServiceBuilder{
    @Override
    RepairServiceBuilder buildName() {
        getService().setServiceName("Ремонт");
        return this;
    }

    @Override
    RepairServiceBuilder buildPrice() {
        getService().setPrice(300000);
        return this;
    }
}
