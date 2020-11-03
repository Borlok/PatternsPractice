package com.borlok.patternspractice.behaviorpatterns.iterator;

public class IteratorExample {
    public IteratorExample() {
        String [] models = {"Vesta", "X-Ray", "Ваз2110"};
        Cars cars = new Cars("Lada",models);

        Iterator iterator = cars.getIterator();
        System.out.println("Mark name: " + cars.getMarkName() +
                "\n\nModels: ");

        while (iterator.hasNext())
            System.out.print(iterator.next().toString() + " ");
    }
}
