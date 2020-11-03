package com.borlok.patternspractice.behaviorpatterns.chainofresponce;

public class Developer extends Notificator {
    public Developer(TypeOfMeeting meetingLevel) {
        super(meetingLevel);
    }

    @Override
    protected void write(String message) {
        System.out.println("Разработчики получили сообщение: " + message);
    }
}
