package com.borlok.patternspractice.generatepatterns.factory;

public class ClassicalMusicFactory implements MusicFactory{
    @Override
    public Music createInstance() {
        return new ClassicalMusic();
    }
}
