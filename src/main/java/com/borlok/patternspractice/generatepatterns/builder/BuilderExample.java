package com.borlok.patternspractice.generatepatterns.builder;

public class BuilderExample {
    public BuilderExample() {
        Director director = new Director();
        director.setServiceBuilder(new CouchServiceBuilder());
        Service service = director.buildService();
        System.out.println(service);
    }
}
