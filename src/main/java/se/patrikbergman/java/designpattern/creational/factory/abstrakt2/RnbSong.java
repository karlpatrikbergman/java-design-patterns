package se.patrikbergman.java.designpattern.creational.factory.abstrakt2;

import lombok.Value;

/**
 * Concrete product 2
 */
@Value
class RnbSong implements Song {
    private final String lyrics;
}
