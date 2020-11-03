package com.borlok.patternspractice.generatepatterns.factory;

public class RockMusicFactory implements MusicFactory{

    @Override
    public Music createInstance() {
        return new RockMusic();
    }
}
