package com.borlok.patternspractice.structurepatterns.Bridge;

public class ProfessionalDriver implements Driver{
    @Override
    public void drive() {
        System.out.println("Водитель едет профессионально");
    }
}
