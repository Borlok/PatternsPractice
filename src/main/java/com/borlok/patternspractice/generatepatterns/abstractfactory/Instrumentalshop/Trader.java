package com.borlok.patternspractice.generatepatterns.abstractfactory.Instrumentalshop;

import com.borlok.patternspractice.generatepatterns.abstractfactory.Manager;

public class Trader implements Manager {
    @Override
    public void supervise() {
        System.out.println("Сидит в контакте, если надо обслуживает клиентов");
    }
}
