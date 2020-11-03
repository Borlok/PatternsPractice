package com.borlok.patternspractice.generatepatterns.factory;

public class RockMusic implements Music{
    @Override
    public void play() {
        System.out.println("Играет рок музыка");
    }
}
