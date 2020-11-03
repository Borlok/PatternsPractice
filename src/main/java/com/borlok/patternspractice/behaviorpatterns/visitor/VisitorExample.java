package com.borlok.patternspractice.behaviorpatterns.visitor;

public class VisitorExample {
    public VisitorExample() {
        MovementImpl movement = new MovementImpl();
        movement.go(new Lada());
        System.out.println("=====================================");
        movement.go(new Toyota());
    }
}
