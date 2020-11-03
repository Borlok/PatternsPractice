package com.borlok.patternspractice.generatepatterns.factory;

public class FactoryExample {

    public FactoryExample() {
    MusicFactory musicFactory = createMusicByName("classic");
    Music music = musicFactory.createInstance();
    music.play();
}

    static MusicFactory createMusicByName (String name) {
        return switch (name.toLowerCase()) {
            case "classic" -> new ClassicalMusicFactory();
            case "rock" -> new RockMusicFactory();
            default -> throw new RuntimeException(name + " недопустимое имя жанра музыки");
        };
    }

}
