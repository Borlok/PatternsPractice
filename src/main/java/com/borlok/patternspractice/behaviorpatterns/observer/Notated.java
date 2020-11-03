package com.borlok.patternspractice.behaviorpatterns.observer;

public interface Notated {
    void addNotated(Employee employee);
    void setMessage(String message);
    void removeNotated(Employee employee);
    void signalAll();
}
