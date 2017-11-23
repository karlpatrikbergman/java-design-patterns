package se.patrikbergman.java.designpattern.creational.factory.abstrakt2;

import lombok.Value;

/**
 * Concrete product 1
 */
@Value
class HeavyMetalSong implements Song {

    private final String lyrics;

    @Override
    public int getRockFactor() {
        return 10;
    }

    @Override
    public int getRomanticFactor() {
        return 2;
    }
}
