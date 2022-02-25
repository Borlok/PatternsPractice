package com.borlok.patternspractice.generatepatterns.builder;

public class Service {
    private String serviceName;
    private int price;

    public Service() {
    }

    private Service(Builder builder) {
        this.serviceName = builder.serviceName;
        this.price = builder.price;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static class Builder {
        private String serviceName;
        private int price;

        public Builder(String serviceName, int price) {
            this.serviceName = serviceName;
            this.price = price;
        }

        public Service build() {
            return new Service(this);
        }
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceName='" + serviceName + '\'' +
                ", price=" + price +
                '}';
    }
}
