package com.borlok.patternspractice.behaviorpatterns.templatemethod;

public abstract class PeopleTemplate {
    public void dayAction() {
        System.out.println("Просыпаемся\nЗавтракаем\nИдем на работу");
        differenceOfBehaviour();
        System.out.println("Ужинаем\nЛожимся спать");
    }
    public abstract void differenceOfBehaviour ();
}
