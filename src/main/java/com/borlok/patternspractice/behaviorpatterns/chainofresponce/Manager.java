package com.borlok.patternspractice.behaviorpatterns.chainofresponce;

public class Manager extends Notificator {
    public Manager(TypeOfMeeting meetingLevel) {
        super(meetingLevel);
    }

    @Override
    protected void write(String message) {
        System.out.println("Менеджеры получили сообщение: " + message);
    }
}
