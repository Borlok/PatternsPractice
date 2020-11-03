package com.borlok.patternspractice.behaviorpatterns.state;

public class Hunter {
    private Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void changeAction () {
        if (action instanceof Go)
           setAction(new Eat());
        else if (action instanceof Eat)
            setAction(new Walk());
        else if (action instanceof Walk)
            setAction(new Shoot());
        else setAction(new Go());
    }

    public void hunting() {
        action.action();
    }
}
