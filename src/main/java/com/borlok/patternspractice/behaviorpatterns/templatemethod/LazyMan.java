package com.borlok.patternspractice.behaviorpatterns.templatemethod;

public class LazyMan extends PeopleTemplate{
    @Override
    public void differenceOfBehaviour() {
        System.out.println("Пинаем балду\nОтлыниваем от работы\nИдем в бар с друзьями");
    }
}
