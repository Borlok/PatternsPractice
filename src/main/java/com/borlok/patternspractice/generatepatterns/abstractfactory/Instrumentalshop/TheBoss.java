package com.borlok.patternspractice.generatepatterns.abstractfactory.Instrumentalshop;

import com.borlok.patternspractice.generatepatterns.abstractfactory.Director;

public class TheBoss implements Director {
    @Override
    public void manageAnObject() {
        System.out.println("Постоянно нет на месте, говорит что по делам, а сам сидит дома.");
    }
}
