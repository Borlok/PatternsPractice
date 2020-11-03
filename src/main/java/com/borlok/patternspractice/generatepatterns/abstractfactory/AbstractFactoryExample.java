package com.borlok.patternspractice.generatepatterns.abstractfactory;

import com.borlok.patternspractice.generatepatterns.abstractfactory.Instrumentalshop.InstrumentalShopFactory;
import com.borlok.patternspractice.generatepatterns.abstractfactory.autodealer.AutoDealerFactory;

public class AbstractFactoryExample {
    public AbstractFactoryExample() {
        WorkingTeamFactory autoDealerFactory = new AutoDealerFactory();
        Director director = autoDealerFactory.createDirector();
        Accountant accountant = autoDealerFactory.createAccountant();
        Manager manager = autoDealerFactory.createManager();
        Employee employee = autoDealerFactory.createEmployee();
        System.out.println("--Автосалон--");
        director.manageAnObject();
        accountant.countMoney();
        manager.supervise();
        employee.work();

        System.out.println("----------------------------");
        System.out.println("--Магазин инструментов--");
        WorkingTeamFactory instrumentalShopFactory = new InstrumentalShopFactory();
        Director boss = instrumentalShopFactory.createDirector();
        Accountant resourceManager = instrumentalShopFactory.createAccountant();
        Manager trader = instrumentalShopFactory.createManager();
        Employee worker = instrumentalShopFactory.createEmployee();

        boss.manageAnObject();
        resourceManager.countMoney();
        trader.supervise();
        worker.work();
        System.out.println();
    }
}
