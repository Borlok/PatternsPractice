package com.borlok.patternspractice.generatepatterns.abstractfactory.autodealer;

import com.borlok.patternspractice.generatepatterns.abstractfactory.*;

public class AutoDealerFactory implements WorkingTeamFactory {
    @Override
    public Director createDirector() {
        return new DirectorOfMotorShow();
    }

    @Override
    public Accountant createAccountant() {
        return new Bookkeeper();
    }

    @Override
    public Manager createManager() {
        return new AutoDealer();
    }

    @Override
    public Employee createEmployee() {
        return new Worker();
    }
}
