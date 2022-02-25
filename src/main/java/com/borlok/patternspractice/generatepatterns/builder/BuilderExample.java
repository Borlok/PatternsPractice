package com.borlok.patternspractice.generatepatterns.builder;

public class BuilderExample {
    public BuilderExample() {
        Director director = new Director();
        director.setServiceBuilder(new CouchServiceBuilder());
        Service service = director.buildService();
        System.out.println(service);
        /////////////////////// Второй пример (Лучше)
        Service service2 = new Service.Builder("Alex", 12).build();
        System.out.println(service2);
    }
}
