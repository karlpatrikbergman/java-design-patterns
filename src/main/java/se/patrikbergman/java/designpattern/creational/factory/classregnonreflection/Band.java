package se.patrikbergman.java.designpattern.creational.factory.classregnonreflection;

public abstract class Band {
    public static enum Type{ROCK_BAND, BLUES_BAND, BOOGIE_BAND}
    public abstract Band create();
    public abstract void play();
}
