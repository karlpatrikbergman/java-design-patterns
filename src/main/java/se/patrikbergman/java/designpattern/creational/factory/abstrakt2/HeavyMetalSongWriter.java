package se.patrikbergman.java.designpattern.creational.factory.abstrakt2;

/**
 * Concrete factory 1
 */
class HeavyMetalSongWriter implements SongWriter {

    @Override
    public Song writeSong(String lyrics) {
        return new HeavyMetalSong(lyrics);
    }
}