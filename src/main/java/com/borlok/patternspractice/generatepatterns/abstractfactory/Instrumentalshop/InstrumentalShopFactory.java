package com.borlok.patternspractice.generatepatterns.abstractfactory.Instrumentalshop;

import com.borlok.patternspractice.generatepatterns.abstractfactory.*;

public class InstrumentalShopFactory implements WorkingTeamFactory {
    @Override
    public Director createDirector() {
        return new TheBoss();
    }

    @Override
    public Accountant createAccountant() {
        return new ResourcesManager();
    }

    @Override
    public Manager createManager() {
        return new Trader();
    }

    @Override
    public Employee createEmployee() {
        return new Loader();
    }
}
