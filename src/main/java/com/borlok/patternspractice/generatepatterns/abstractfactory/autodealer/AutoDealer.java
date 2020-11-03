package com.borlok.patternspractice.generatepatterns.abstractfactory.autodealer;

import com.borlok.patternspractice.generatepatterns.abstractfactory.Manager;

public class AutoDealer implements Manager {
    @Override
    public void supervise() {
        System.out.println("Следит за рабочим, общается с клиентами");
    }
}
