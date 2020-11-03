package com.borlok.patternspractice.structurepatterns.proxy;

public class Opel implements Car{
    private boolean key = false;

    public Opel(boolean key) {
        this.key = key;
        getKey();
    }

    private void getKey() {
        System.out.println("Получил ключи: " + key);
    }

    @Override
    public void run() {
        System.out.println("Поехали");
    }
}
