package com.borlok.patternspractice.behaviorpatterns.memento;

public class BD {
    private Save save;

    public void save(Save save) {
        this.save = save;
    }

    public Save getSave() {
        return save;
    }
}
