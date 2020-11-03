package com.borlok.patternspractice.behaviorpatterns.observer;

public class Employee implements Notifier{
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void signalAll(String message) {
        System.out.println("Dear "
                + name
                + " \nwe have a message for you:\n"
                + message
                + "\n=================================================\n");
    }

    @Override
    public String toString() {
        return name;
    }
}
