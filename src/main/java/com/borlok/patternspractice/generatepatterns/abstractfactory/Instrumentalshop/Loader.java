package com.borlok.patternspractice.generatepatterns.abstractfactory.Instrumentalshop;

import com.borlok.patternspractice.generatepatterns.abstractfactory.Employee;

public class Loader implements Employee {
    @Override
    public void work() {
        System.out.println("Таскает тяжести, жалуется на низкую зп");
    }
}
