package com.borlok.patternspractice.behaviorpatterns.templatemethod;

public class TemplateMethodExample {
    public TemplateMethodExample() {
        PeopleTemplate lazyMan = new LazyMan();
        PeopleTemplate hardWorkingMan = new HardWorkingMan();

        lazyMan.dayAction();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        hardWorkingMan.dayAction();
    }
}
