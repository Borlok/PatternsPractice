package com.borlok.patternspractice.behaviorpatterns.visitor;

public class Lada implements Car{
    @Override
    public void go(Highway highway) {
        System.out.println("По трассе: Едет как говно");
    }

    @Override
    public void go(OffRoad offRoad) {
        System.out.println("По бездорожью: Плетется как говно...Что-то дребезжит");
    }

    @Override
    public void go(CityRoad cityRoad) {
        System.out.println("По городу: Говно - но едет.");
    }
}
