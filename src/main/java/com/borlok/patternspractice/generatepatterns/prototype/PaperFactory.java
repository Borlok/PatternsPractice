package com.borlok.patternspractice.generatepatterns.prototype;

public class PaperFactory {
    private Paper paper;

    public PaperFactory(Paper paper) {
        this.paper = paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public Paper clone () {
        return (Paper) paper.copy();
    }
}
