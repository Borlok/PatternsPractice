package com.borlok.patternspractice.generatepatterns.builder;

public class Director {
    private ServiceBuilder serviceBuilder;

    public void setServiceBuilder(ServiceBuilder serviceBuilder) {
        this.serviceBuilder = serviceBuilder;
    }

    Service buildService() {
        serviceBuilder.createService();
         serviceBuilder.buildName();
         serviceBuilder.buildPrice();
         return serviceBuilder.getService();
    }
}
