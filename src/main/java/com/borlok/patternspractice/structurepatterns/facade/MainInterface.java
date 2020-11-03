package com.borlok.patternspractice.structurepatterns.facade;

public class MainInterface {
    private final Access access = new Access();
    private final Repository repository = new Repository(access);
    private final Controller controller = new Controller(repository);

    public void getSomethingFromRepository() {
        access.openAccess();
        controller.getFromRepository();
    }

}
