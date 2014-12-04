package se.patrikbergman.java.designpattern.creational.factory.classregreflection;

public interface Band {
    static enum Type{ROCK_BAND, BLUES_BAND, BOOGIE_BAND}
    void play();
}
