package com.borlok.patternspractice.structurepatterns.proxy;

public class ProxyCar implements Car{
    private boolean key;
    private Opel opel;

    public ProxyCar(boolean key) {
        this.key = key;
    }


    @Override
    public void run() {
        if (opel == null)
            opel = new Opel(key);
        opel.run();
    }
}
