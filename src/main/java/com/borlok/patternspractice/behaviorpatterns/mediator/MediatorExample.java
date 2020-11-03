package com.borlok.patternspractice.behaviorpatterns.mediator;

public class MediatorExample {
    public MediatorExample() {
        SmartHome smartHome = new SmartHome();
        CoffeeMachine coffeeMachine = new CoffeeMachine(smartHome);
        Conditioner conditioner = new Conditioner(smartHome);
        AllTechnique allTechnique = new AllTechnique(smartHome);

        allTechnique.addTechnique(coffeeMachine);
        allTechnique.addTechnique(conditioner);

        smartHome.addTechnique(coffeeMachine);
        smartHome.addTechnique(conditioner);

        allTechnique.start("Включить");
    }
}
