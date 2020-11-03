package com.borlok.patternspractice;

import com.borlok.patternspractice.behaviorpatterns.chainofresponce.ChainOfResponsibilityExample;
import com.borlok.patternspractice.behaviorpatterns.command.CommandExample;
import com.borlok.patternspractice.behaviorpatterns.interpretator.InterpretationExample;
import com.borlok.patternspractice.behaviorpatterns.iterator.IteratorExample;
import com.borlok.patternspractice.behaviorpatterns.mediator.MediatorExample;
import com.borlok.patternspractice.behaviorpatterns.memento.MementoExample;
import com.borlok.patternspractice.behaviorpatterns.observer.ObserverExample;
import com.borlok.patternspractice.behaviorpatterns.state.StateExample;
import com.borlok.patternspractice.behaviorpatterns.strategy.StrategyExample;
import com.borlok.patternspractice.behaviorpatterns.templatemethod.TemplateMethodExample;
import com.borlok.patternspractice.behaviorpatterns.visitor.VisitorExample;
import com.borlok.patternspractice.generatepatterns.abstractfactory.AbstractFactoryExample;
import com.borlok.patternspractice.generatepatterns.builder.BuilderExample;
import com.borlok.patternspractice.generatepatterns.factory.FactoryExample;
import com.borlok.patternspractice.generatepatterns.prototype.PrototypeExample;
import com.borlok.patternspractice.generatepatterns.singleton.SteveJobs;
import com.borlok.patternspractice.structurepatterns.Bridge.BridgeExample;
import com.borlok.patternspractice.structurepatterns.adapter.AdapterExample;
import com.borlok.patternspractice.structurepatterns.composite.CompositeExample;
import com.borlok.patternspractice.structurepatterns.decorator.DecoratorExample;
import com.borlok.patternspractice.structurepatterns.facade.FacadeExample;
import com.borlok.patternspractice.structurepatterns.flyweight.FlyWeightExample;
import com.borlok.patternspractice.structurepatterns.proxy.ProxyExample;

public class Main {

    public static void main(String[] args) {
        new FactoryExample(); // Паттерн фабрика
        new AbstractFactoryExample(); // Паттерн абстрактная фабрика
        System.out.println(SteveJobs.getInstance().toString()); // Паттерн синглтон
        new BuilderExample(); // Паттерн builder
        new PrototypeExample(); // Паттерн прототип
        new AdapterExample(); // Паттерн адаптер
        new BridgeExample(); // Паттерн мост
        new CompositeExample(); // Паттерн компоновщик
        new DecoratorExample(); // Паттерн декоратор
        new FacadeExample(); // Паттерн фассад
        new FlyWeightExample(); // Паттерн приспособленец
        new ProxyExample(); // Паттерн прокси
        new ChainOfResponsibilityExample(); // Паттерн цепочка ответственности
        new CommandExample(); // Паттерн комманда
        new InterpretationExample(); // Паттерн интерпретирования
        new IteratorExample(); // Паттерн итератор
        new MediatorExample(); // Паттерн посредник
        new MementoExample(); // Паттерн хранитель
        new ObserverExample(); // Паттерн наблюдатель
        new StateExample(); // Паттерн состояние
        new StrategyExample(); // Паттерн стратегия
        new TemplateMethodExample(); // Паттерн шаблонный метод
        new VisitorExample(); // Паттерн визитер
    }
}
