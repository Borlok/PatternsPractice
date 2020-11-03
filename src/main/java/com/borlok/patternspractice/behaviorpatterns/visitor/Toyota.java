package com.borlok.patternspractice.behaviorpatterns.visitor;

public class Toyota implements Car {
    @Override
    public void go(Highway highway) {
        System.out.println("По трассе: Летим с комфортом");
    }

    @Override
    public void go(OffRoad offRoad) {
        System.out.println("По бездорожью: Встряли в первой яме");
    }

    @Override
    public void go(CityRoad cityRoad) {
        System.out.println("По городу: Очень комфортно ехать");
    }
}
