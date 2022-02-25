package com.borlok.patternspractice.generatepatterns.factory;

public class FactoryExample {

    public FactoryExample() {
    MusicFactory musicFactory = createMusicByName("classic");
    Music music = musicFactory.createInstance();
    music.play();
}

    static MusicFactory createMusicByName (String name) {
        switch (name.toLowerCase()) {
            case "classic":
                return new ClassicalMusicFactory();
            case "rock":
                return new RockMusicFactory();
            default:
                throw new RuntimeException(name + " недопустимое имя жанра музыки");
        }
    }

}
