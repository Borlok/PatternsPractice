package com.borlok.patternspractice.structurepatterns.facade;

public class Repository {
    private Access access;

    public Repository(Access access) {
        this.access = access;
    }

    public void getAnyThink () {
        if (access.isOpen())
            System.out.println("Возвращаем нечто из репозитория");
        else
            System.out.println("Не удалось получить доступ");
    }
}
