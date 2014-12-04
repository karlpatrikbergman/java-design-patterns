package se.patrikbergman.java.designpattern.creational.factory.simple;

public interface Band {
    static enum Type{ROCK_BAND, BLUES_BAND}

    void play();
}
