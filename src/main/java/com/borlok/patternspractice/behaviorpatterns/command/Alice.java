package com.borlok.patternspractice.behaviorpatterns.command;

public class Alice {
    private final Action search;
    private final Action advise;
    private final Action joking;

    public Alice(Action search, Action advise, Action joking) {
        this.search = search;
        this.advise = advise;
        this.joking = joking;
    }

    public void search() {
        search.execute();
    }

    public void advise () {
        advise.execute();
    }

    public void joking () {
        joking.execute();
    }

}
