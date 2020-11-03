package com.borlok.patternspractice.generatepatterns.builder;

public class Service {
    private String serviceName;
    private int price;

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceName='" + serviceName + '\'' +
                ", price=" + price +
                '}';
    }
}
