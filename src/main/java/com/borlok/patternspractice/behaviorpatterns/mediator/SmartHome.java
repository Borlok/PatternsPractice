package com.borlok.patternspractice.behaviorpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class SmartHome implements CommandForSmartHome {
    private final List<Technique> techniques = new ArrayList<>();

    public void addTechnique(Technique technique) {
        techniques.add(technique);
    }

    @Override
    public void start(String command) {
        try {
            System.out.println("Введена комманда: " + command);
            System.out.print("Добро пожаловать домой.");

            Thread.sleep(800);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.println(".");
            Thread.sleep(500);

            System.out.println("Состояние техники:");

            for (Technique t : techniques) {
                System.out.print(t.toString() + ": ");
                t.getCondition();
                Thread.sleep(100);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Проверка выполнена, приятного времяпровождения.");
    }
}
