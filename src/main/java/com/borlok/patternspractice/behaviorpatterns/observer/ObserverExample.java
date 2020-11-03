package com.borlok.patternspractice.behaviorpatterns.observer;

public class ObserverExample {
    public ObserverExample() {
        MessageAll messageAll = new MessageAll();
        Employee director = new Employee("Юрий Александрович");
        Employee worker = new Employee("Олег Викторович");
        Employee worker2 = new Employee("Петр Алексеевич");

        messageAll.addNotated(director);
        messageAll.addNotated(worker);
        messageAll.addNotated(worker2);

        messageAll.setMessage("Все на работу!!!");

        Employee worker3 = new Employee("Алексей Петрович");
        messageAll.addNotated(worker3);
        messageAll.setMessage("У нас новый участник! " + worker3.toString() + "!");
    }
}
