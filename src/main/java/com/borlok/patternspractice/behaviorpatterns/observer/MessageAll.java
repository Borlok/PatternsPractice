package com.borlok.patternspractice.behaviorpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class MessageAll implements Notated{
    private final List<Notifier> notifiers = new ArrayList<>();
    private String message = "Все без изменений";

    @Override
    public void addNotated(Employee employee) {
        notifiers.add(employee);
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
        signalAll();
    }

    @Override
    public void removeNotated(Employee employee) {
        notifiers.remove(employee);
    }

    @Override
    public void signalAll() {
        for (Notifier a : notifiers) {
            a.signalAll(message);
        }
    }
}
