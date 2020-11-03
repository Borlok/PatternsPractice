package com.borlok.patternspractice.generatepatterns.abstractfactory;

public interface WorkingTeamFactory {
    Director createDirector();
    Accountant createAccountant();
    Manager createManager();
    Employee createEmployee();
}
