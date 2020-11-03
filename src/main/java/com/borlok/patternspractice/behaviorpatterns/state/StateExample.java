package com.borlok.patternspractice.behaviorpatterns.state;

public class StateExample {
    public StateExample() {
        Action go = new Go();
        Hunter hunter = new Hunter();

        hunter.setAction(go);

        for (int i = 0; i < 10; i++) {
            hunter.hunting();
            hunter.changeAction();
        }
    }
}
