package com.borlok.patternspractice.behaviorpatterns.strategy;

public class Hunter {
    private Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void doAction() {
        action.action();
    }
}
