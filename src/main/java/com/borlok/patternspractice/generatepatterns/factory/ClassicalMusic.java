package com.borlok.patternspractice.generatepatterns.factory;

public class ClassicalMusic implements Music {
    @Override
    public void play() {
        System.out.println("Играет классическая музыка");
    }
}
