package com.borlok.patternspractice.behaviorpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class AllTechnique implements Technique{
    private List<Technique> techniques = new ArrayList<>();
    private SmartHome smartHome;

    public AllTechnique(SmartHome smartHome) {
        this.smartHome = smartHome;
    }

    public void addTechnique (Technique technique) {
        techniques.add(technique);
    }


    @Override
    public void start(String condition) {
        setCondition(condition);
        smartHome.start(condition);
    }

    @Override
    public void getCondition() {
        for (Technique t : techniques) {
            System.out.print(t.toString());
            t.getCondition();
        }
    }

    @Override
    public void setCondition(String condition) {
        for (Technique t : techniques) {
            if (condition.equalsIgnoreCase("Включить")) {
                t.setCondition("Включено");
            } else {
                t.setCondition("Выключено");
            }
        }
    }
}
