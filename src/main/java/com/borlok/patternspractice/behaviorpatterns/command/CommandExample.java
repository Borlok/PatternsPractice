package com.borlok.patternspractice.behaviorpatterns.command;

public class CommandExample {
    public CommandExample() {
        Alice alice = new Alice(
                new Search(),
                new Advise(),
                new Joking()
        );

        alice.search();
        alice.advise();
        alice.joking();
    }
}
