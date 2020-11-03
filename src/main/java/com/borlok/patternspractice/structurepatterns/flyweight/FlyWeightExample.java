package com.borlok.patternspractice.structurepatterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyWeightExample {
    public FlyWeightExample() {
        EmployeeFactory factory = new EmployeeFactory();
        List <Employee> employees = new ArrayList<>();
        employees.add(factory.getEmployeeByName("director"));
        employees.add(factory.getEmployeeByName("director"));
        employees.add(factory.getEmployeeByName("director"));
        employees.add(factory.getEmployeeByName("director"));
        employees.add(factory.getEmployeeByName("director"));
        employees.add(factory.getEmployeeByName("director"));
        employees.add(factory.getEmployeeByName("loader"));
        employees.add(factory.getEmployeeByName("loader"));
        employees.add(factory.getEmployeeByName("loader"));
        employees.add(factory.getEmployeeByName("loader"));
        employees.add(factory.getEmployeeByName("loader"));
        employees.add(factory.getEmployeeByName("loader"));

        for (Employee e : employees)
            e.work();

    }
}
