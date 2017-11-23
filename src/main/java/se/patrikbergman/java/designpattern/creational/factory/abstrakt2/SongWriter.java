package se.patrikbergman.java.designpattern.creational.factory.abstrakt2;

/**
 * Abstract Factory
 */
@FunctionalInterface
interface SongWriter {
    Song writeSong(String lyrics);
}