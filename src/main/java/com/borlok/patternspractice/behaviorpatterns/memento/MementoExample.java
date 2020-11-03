package com.borlok.patternspractice.behaviorpatterns.memento;

public class MementoExample {
    public MementoExample() {
        SomeFile file = new SomeFile("File.txt","version 1.0");
        BD bd = new BD();
        System.out.println(file);
        bd.save(file.save());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        file.setVersion("v 1.1");
        System.out.println(file);

        file.load(bd.getSave());
        System.out.println(file);

    }
}
