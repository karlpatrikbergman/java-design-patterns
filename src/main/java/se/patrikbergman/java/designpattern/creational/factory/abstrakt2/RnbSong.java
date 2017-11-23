package se.patrikbergman.java.designpattern.creational.factory.abstrakt2;

import lombok.Value;

/**
 * Concrete product 2
 */
@Value
class RnbSong implements Song {

    private final String lyrics;

    @Override
    public int getRockFactor() {
        return 1;
    }

    @Override
    public int getRomanticFactor() {
        return 10;
    }
}
