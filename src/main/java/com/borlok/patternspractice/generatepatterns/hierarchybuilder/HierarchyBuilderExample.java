package com.borlok.patternspractice.generatepatterns.hierarchybuilder;

import static com.borlok.patternspractice.generatepatterns.hierarchybuilder.NyPizza.Size.SMALL;

public class HierarchyBuilderExample {
    public HierarchyBuilderExample() {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(Pizza.Topping.TOMATO)
                .addTopping(Pizza.Topping.ONION).build();
        System.out.println(pizza);
    }
}
