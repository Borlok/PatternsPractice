package com.borlok.patternspractice.behaviorpatterns.memento;

import java.util.Date;

public class Save {
    private final String name;
    private final String version;
    private final Date date;

    public Save(String name, String version) {
        this.name = name;
        this.version = version;
        date = new Date();
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}
