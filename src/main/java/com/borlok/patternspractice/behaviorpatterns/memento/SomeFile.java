package com.borlok.patternspractice.behaviorpatterns.memento;

import java.util.Date;

public class SomeFile {
    private String name;
    private String version;
    private Date date;

    public SomeFile(String name, String version) {
        this.name = name;
        this.version = version;
        date = new Date();
    }

    public Save save () {
        return new Save(name,version);
    }

    public void load (Save save) {
        name = save.getName();
        version = save.getVersion();
        date = save.getDate();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
        date = new Date();
    }

    @Override
    public String toString() {
        return "SomeFile:\n" +
                "Name: " + name +
                "\nVersion: " + version +
                "\nDate: " + date + "\n";


    }
}
