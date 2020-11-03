package com.borlok.patternspractice.generatepatterns.singleton;

public class SteveJobs {
    private static final transient SteveJobs GET_INSTANCE = new SteveJobs();

    private SteveJobs() {
    }

    public static SteveJobs getInstance() {
        return GET_INSTANCE;
    }

    @Override
    public String toString() {
        return "i'm really Steve Jobs";
    }
}
