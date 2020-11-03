package com.borlok.patternspractice.structurepatterns.facade;

public class FacadeExample {
    public FacadeExample() {
        MainInterface mainInterface = new MainInterface();
        mainInterface.getSomethingFromRepository();
    }
}
