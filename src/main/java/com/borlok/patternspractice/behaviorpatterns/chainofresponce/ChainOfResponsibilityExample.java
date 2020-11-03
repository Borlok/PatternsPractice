package com.borlok.patternspractice.behaviorpatterns.chainofresponce;

public class ChainOfResponsibilityExample {
    public ChainOfResponsibilityExample() {
        Notificator developer = new Developer(TypeOfMeeting.DEVELOPERS);
        Notificator manager = new Manager(TypeOfMeeting.MANAGERS);
        Notificator director = new Director(TypeOfMeeting.COMMON);

        developer.setNextNotificationLevel(manager);
        manager.setNextNotificationLevel(director);

        developer.announcement(1,"Собрание в главном зале");
    }
}
