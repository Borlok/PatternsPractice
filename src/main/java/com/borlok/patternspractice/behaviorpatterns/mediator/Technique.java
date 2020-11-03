package com.borlok.patternspractice.behaviorpatterns.mediator;

public interface Technique {
    void start(String condition);
    void getCondition();
    void setCondition(String condition);
}
