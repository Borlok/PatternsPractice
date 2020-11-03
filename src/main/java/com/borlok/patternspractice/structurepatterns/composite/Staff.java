package com.borlok.patternspractice.structurepatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Staff {
    private List<Employee> workers = new ArrayList<>();

    void addWorker(Employee employee) {
        workers.add(employee);
    }

    public void working() {
        for (Employee employee : workers)
            employee.work();
    }
}
