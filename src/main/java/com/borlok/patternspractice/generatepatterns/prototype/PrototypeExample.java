package com.borlok.patternspractice.generatepatterns.prototype;

public class PrototypeExample {
    public PrototypeExample() {
        int id = 0;
        Paper whitePaper = new Paper(++id,"White");
        System.out.println(whitePaper);
        PaperFactory factory = new PaperFactory(whitePaper);
        Paper cloneWhitePaper = factory.clone();
        System.out.println(cloneWhitePaper);
    }
}
