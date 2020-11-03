package com.borlok.patternspractice.behaviorpatterns.mediator;

public class CoffeeMachine implements Technique {
    private String condition = "Выключено";
    private CommandForSmartHome smartHome;

    public CoffeeMachine(CommandForSmartHome smartHome) {
        this.smartHome = smartHome;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public void start(String ex) {
        if (ex.equalsIgnoreCase("Включить")) {
            condition = "Включено";
        } else {
            condition = "Выключено";
        }
        smartHome.start(ex);

    }

    @Override
    public void getCondition() {
        System.out.println(condition);
    }

    @Override
    public String toString() {
        return "Кофемашина";
    }
}
