package com.borlok.patternspractice.generatepatterns.abstractfactory.autodealer;

import com.borlok.patternspractice.generatepatterns.abstractfactory.Director;

public class DirectorOfMotorShow implements Director {
    @Override
    public void manageAnObject() {
        System.out.println("Пинает балду, с грозным и важным видом выходит в зал");
    }
}
