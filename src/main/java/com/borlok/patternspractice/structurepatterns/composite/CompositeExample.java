package com.borlok.patternspractice.structurepatterns.composite;


public class CompositeExample {
    public CompositeExample() {
        Staff staff = new Staff();

        Employee director = new Director();
        Employee seller = new Seller();
        Employee loader = new Loader();

        staff.addWorker(director);
        staff.addWorker(seller);
        staff.addWorker(loader);

        staff.working();
    }
}
