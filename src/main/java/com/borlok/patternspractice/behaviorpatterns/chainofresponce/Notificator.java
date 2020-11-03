package com.borlok.patternspractice.behaviorpatterns.chainofresponce;

public abstract class Notificator {
    private final TypeOfMeeting meetingLevel;
    private Notificator notificatorLevel;

    public Notificator(TypeOfMeeting meetingLevel) {
        this.meetingLevel = meetingLevel;
    }

    public void setNextNotificationLevel(Notificator notificatorLevel) {
        this.notificatorLevel = notificatorLevel;
    }

    public void announcement(int levelOfAnnouncement, String message) {
        if (meetingLevel.ordinal() <= levelOfAnnouncement) {
            write(message);
        }
        if (notificatorLevel != null) {
            notificatorLevel.announcement(levelOfAnnouncement, message);
        }
    }

    protected abstract void write(String message);
}
