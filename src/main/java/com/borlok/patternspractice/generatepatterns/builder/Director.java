package com.borlok.patternspractice.generatepatterns.builder;

public class Director {
    private ServiceBuilder serviceBuilder;

    public void setServiceBuilder(ServiceBuilder serviceBuilder) {
        this.serviceBuilder = serviceBuilder;
    }

    Service buildService() {
        return serviceBuilder.createService()
                .buildName()
                .buildPrice().getService();
    }
}
