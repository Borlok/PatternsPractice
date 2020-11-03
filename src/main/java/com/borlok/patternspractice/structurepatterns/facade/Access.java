package com.borlok.patternspractice.structurepatterns.facade;

public class Access {
    private boolean access = false;

    public boolean isOpen() {
        return access;
    }

    public boolean openAccess() {
        System.out.println("Доступ разрешен");
        return access = true;
    }

    public boolean closeAccess() {
        System.out.println("Доступ запрещен");
        return access = false;
    }
}
