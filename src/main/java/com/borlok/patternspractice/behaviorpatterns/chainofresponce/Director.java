package com.borlok.patternspractice.behaviorpatterns.chainofresponce;

public class Director extends Notificator {
    public Director(TypeOfMeeting meetingLevel) {
        super(meetingLevel);
    }

    @Override
    protected void write(String message) {
        System.out.println("Директоры получили сообщение: " + message);
    }
}
