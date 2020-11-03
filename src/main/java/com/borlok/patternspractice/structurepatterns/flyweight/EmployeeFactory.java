package com.borlok.patternspractice.structurepatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
    private final Map<String, Employee> employs = new HashMap<>();

    public Employee getEmployeeByName(String name) {
        Employee employee = employs.get(name);
        if (employee == null) {
        switch (name) {
                case "director" -> employee = new Director();
                case "loader" -> employee = new Loader();
            }
            System.out.println("Наняли нового работника.");
        employs.put(name,employee);
        }
        return employee;
    }
}
