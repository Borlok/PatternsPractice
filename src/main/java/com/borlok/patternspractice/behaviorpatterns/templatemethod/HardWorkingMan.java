package com.borlok.patternspractice.behaviorpatterns.templatemethod;

public class HardWorkingMan extends PeopleTemplate{
    @Override
    public void differenceOfBehaviour() {
        System.out.println("Усердно трудимся\nУчимся\nИдем домой\nЧитаем");
    }
}
