package com.borlok.patternspractice.structurepatterns.facade;

public class Controller {
    private Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    public void getFromRepository() {
        repository.getAnyThink();
    }
}
